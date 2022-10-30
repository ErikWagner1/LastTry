package com.portfolio.ErikWagner.Controller;

import com.portfolio.ErikWagner.model.Persona;
import com.portfolio.ErikWagner.service.IPersonaService;
import com.portfolio.ErikWagner.model.Acerca;
import com.portfolio.ErikWagner.model.Educacion;
import com.portfolio.ErikWagner.model.Experiencia;
import com.portfolio.ErikWagner.model.Habilidad;
import com.portfolio.ErikWagner.model.Proyecto;
import com.portfolio.ErikWagner.service.IAcercaService;
import com.portfolio.ErikWagner.service.IEducacionService;
import com.portfolio.ErikWagner.service.IExperienciaService;
import com.portfolio.ErikWagner.service.IHabilidadService;
import com.portfolio.ErikWagner.service.IProyectoService;
//import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class Controller {
    
    @Autowired
    private IPersonaService persoServ;

    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        //listaPersonas.add(pers);
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        //return listaPersonas;
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
        
    }
   
    @Autowired
    private IAcercaService acercaServ;
    
    @PostMapping ("/api/new/acerca")
    public void agregarAcerca (@RequestBody Acerca ac){
        //listaPersonas.add(pers);
        acercaServ.crearAcerca(ac);
    }
    
    
    @GetMapping ("/api/ver/acerca")
    @ResponseBody
    public List<Acerca> verAcerca (){
        //return listaPersonas;
        return acercaServ.verAcerca();
    }   
    
    @PutMapping ("/api/modificar/acerca")
    public void modificarAcerca (@RequestBody Acerca ac){
        acercaServ.modificarAcerca (ac);
    }
    
    @DeleteMapping ("/api/delete/acerca/{id}")
    public void borrarAcerca (@PathVariable Long id){
        acercaServ.borrarAcerca(id);
        
    }
    
    @Autowired
    private IEducacionService educacionServ;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        //listaPersonas.add(pers);
        educacionServ.crearEducacion(edu);
    }
    
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion (){
        //return listaPersonas;
        return educacionServ.verEducacion();
    }   
    
    @PutMapping ("/modificar/educacion")
    public void modificarEducacion (@RequestBody Educacion edu){
        educacionServ.modificarEducacion (edu);
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        educacionServ.borrarEducacion(id);
        
    }

    @Autowired
    private IExperienciaService experienciaServ;
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        //listaPersonas.add(pers);
        experienciaServ.crearExperiencia(exp);
    }
    
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia (){
        //return listaPersonas;
        return experienciaServ.verExperiencia();
    }   
    
    @PutMapping ("/modificar/experiencia")
    public void modificarExperiencia (@RequestBody Experiencia exp){
        experienciaServ.modificarExperiencia (exp);
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
        
    }
    
    @Autowired
    private IHabilidadService habilidadServ;
    
    @PostMapping ("/new/habilidad")
    public void agregarHabilidad (@RequestBody Habilidad hab){
        //listaPersonas.add(pers);
        habilidadServ.crearHabilidad(hab);
    }
    
    
    @GetMapping ("/ver/habilidad")
    @ResponseBody
    public List<Habilidad> verHabilidad (){
        //return listaPersonas;
        return habilidadServ.verHabilidad();
    }   
    
    @PutMapping ("/modificar/habilidad")
    public void modificarHabilidad (@RequestBody Habilidad hab){
        habilidadServ.modificarHabilidad (hab);
    }
    
    @DeleteMapping ("/delete/habilidad/{id}")
    public void borrarHabilidad (@PathVariable Long id){
        habilidadServ.borrarHabilidad(id);
        
    }
    
    @Autowired
    private IProyectoService proyectoServ;
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto pro){
        //listaPersonas.add(pers);
        proyectoServ.crearProyecto(pro);
    }
    
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto (){
        //return listaPersonas;
        return proyectoServ.verProyecto();
    }   
    
    @PutMapping ("/modificar/proyecto")
    public void modificarProyecto (@RequestBody Proyecto pro){
        proyectoServ.modificarProyecto (pro);
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proyectoServ.borrarProyecto(id);
        
    }
}
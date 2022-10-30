package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public List<Habilidad> verHabilidad ();
    public void crearHabilidad(Habilidad hab);
    public Habilidad buscarHabilidad (Long id);
    public void modificarHabilidad(Habilidad hab);
    public void borrarHabilidad(Long id);
    
}
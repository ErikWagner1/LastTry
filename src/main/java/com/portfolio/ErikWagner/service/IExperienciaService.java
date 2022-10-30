package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia ();
    public void crearExperiencia(Experiencia exp);
    public Experiencia buscarExperiencia (Long id);
    public void modificarExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    
}
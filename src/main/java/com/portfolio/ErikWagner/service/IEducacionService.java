package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion ();
    public void crearEducacion (Educacion edu);
    public Educacion buscarEducacion (Long id);
    public void modificarEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    
}
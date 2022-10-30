package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto ();
    public void crearProyecto(Proyecto pro);
    public Proyecto buscarProyecto (Long id);
    public void modificarProyecto(Proyecto pro);
    public void borrarProyecto(Long id);
    
}
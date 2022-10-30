package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Acerca;
import java.util.List;


public interface IAcercaService {
    
    public List<Acerca> verAcerca ();
    public void crearAcerca (Acerca ac);
    public Acerca buscarAcerca (Long id);
    public void modificarAcerca(Acerca ac);
    public void borrarAcerca(Long id);
    
}
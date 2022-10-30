package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Habilidad;
import com.portfolio.ErikWagner.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    public HabilidadRepository habilidadRepo;
    
    
    @Override
    public List<Habilidad> verHabilidad() {
        return habilidadRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habilidadRepo.save (hab);
    }
    
    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habilidadRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarHabilidad(Habilidad hab) {
        habilidadRepo.save (hab);
    }
    
    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }

    
}
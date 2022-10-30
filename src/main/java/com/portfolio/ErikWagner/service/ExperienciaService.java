package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Experiencia;
import com.portfolio.ErikWagner.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository experienciaRepo;
    
    
    @Override
    public List<Experiencia> verExperiencia() {
        return experienciaRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        experienciaRepo.save (exp);
    }
    
    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarExperiencia(Experiencia exp) {
        experienciaRepo.save (exp);
    }
    
    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    
}
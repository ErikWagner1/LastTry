package com.portfolio.ErikWagner.service;

import com.portfolio.ErikWagner.model.Acerca;
import com.portfolio.ErikWagner.repository.AcercaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaService implements IAcercaService{

    @Autowired
    public AcercaRepository acercaRepo;
    
    
    @Override
    public List<Acerca> verAcerca() {
        return acercaRepo.findAll();
    }

    @Override
    public void crearAcerca(Acerca ac) {
        acercaRepo.save (ac);
    }
    
    @Override
    public Acerca buscarAcerca(Long id) {
        return acercaRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarAcerca(Acerca ac) {
        acercaRepo.save (ac);
    }
    
    @Override
    public void borrarAcerca(Long id) {
        acercaRepo.deleteById(id);
    }

    
}
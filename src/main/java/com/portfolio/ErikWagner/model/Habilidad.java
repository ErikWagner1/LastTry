package com.portfolio.ErikWagner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String habilidad;
    private String porcentaje;
    
    public Habilidad(){
}
    public Habilidad (Long id, String habilidad,String porcentaje){
        this.id=id;
        this.habilidad=habilidad;
        this.porcentaje=porcentaje;
    }
 }
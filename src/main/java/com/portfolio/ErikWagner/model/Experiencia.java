package com.portfolio.ErikWagner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String empresa;
    private String periodo;
    
    public Experiencia(){
}
    public Experiencia (Long id, String puesto,String empresa, String periodo){
        this.id=id;
        this.puesto=puesto;
        this.empresa=empresa;
        this.periodo=periodo;
    }
 }
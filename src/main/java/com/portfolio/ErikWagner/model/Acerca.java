package com.portfolio.ErikWagner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;



@Getter @Setter
@Entity
public class Acerca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion;
    
    public Acerca(){
}
    public Acerca(Long id, String descripcion){
        this.id=id;
        this.descripcion=descripcion;
    }
 }

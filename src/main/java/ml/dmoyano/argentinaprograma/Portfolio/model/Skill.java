/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Moyano David
 */

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String name;
     private String knowledgeLevel;

    public Skill() {
    }
    
    public Skill(int id, String name, String knowledgeLevel) {
        this.id = id;
        this.name = name;
        this.knowledgeLevel = knowledgeLevel;
    }    
}

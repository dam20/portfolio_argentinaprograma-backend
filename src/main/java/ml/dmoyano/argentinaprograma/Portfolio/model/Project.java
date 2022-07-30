/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.model;

import javax.persistence.Column;
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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(length = 1000)
    private String description;
    private String state;
    private String link;
    private String image;

    public Project() {
    }

    public Project(int id, String name, String description, String state, String link, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.state = state;
        this.link = link;
        this.image = image;
    }
}

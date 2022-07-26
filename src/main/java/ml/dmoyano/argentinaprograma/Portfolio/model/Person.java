/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Moyano David
 */
@Getter
@Setter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String birthDate;
    private String nationality;
    @Column(length = 1000)// anotation para darla mas espacio en la bd a la col
    private String aboutMe;
    private String location;

    //company y position tengo que traerlos de experience
    @Embedded
    private Profile profile;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Education> educations;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Experience> experiences;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Skill> skills;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Project> projects;

    public Person() {

    }

    public Person(Long id, String name, String surname, String birthDate, String nationality, String aboutMe, String location, Profile profile, List<Education> educations, List<Experience> experiences, List<Skill> skills, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.aboutMe = aboutMe;
        this.location = location;
        this.educations = educations;
        this.experiences = experiences;
        this.skills = skills;
        this.projects = projects;
    }

}

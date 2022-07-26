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
public class Education {
      
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String school;
    private String title;
    private String career;
    private String image;
    private Double gpa;
    private String startDate;
    private String endDate;

    public Education() {
    }

    public Education(int id, String school, String title, String career, String image, String startDate, String endDate) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.career = career;
        this.image = image;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}

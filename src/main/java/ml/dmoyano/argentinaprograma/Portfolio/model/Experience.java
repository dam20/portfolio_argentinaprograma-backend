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
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String position;
    private String company;
    private String image;
    private String mode;
    private String startDate;
    private String endDate;

    public Experience() {
    }

    public Experience(String position, String company, String image, String mode, String startDate, String endDate) {
        this.position = position;
        this.company = company;
        this.image = image;
        this.mode = mode;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

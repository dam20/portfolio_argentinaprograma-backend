/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.model;

import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Moyano David
 */
@Getter
@Setter
@Embeddable
public class Profile {

    private String background;
    private String profilePicture;

    public Profile() {

    }

    public Profile(String background, String profilePicture) {
        this.background = background;
        this.profilePicture = profilePicture;
    }

}

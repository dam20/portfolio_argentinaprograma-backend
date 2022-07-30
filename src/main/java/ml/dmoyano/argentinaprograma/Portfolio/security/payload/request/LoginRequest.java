/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.security.payload.request;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author David
 */
@Getter
@Setter
public class LoginRequest {
    	@NotBlank
  private String username;

	@NotBlank
	private String password;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.repository;

import ml.dmoyano.argentinaprograma.Portfolio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Moyano David
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.repository;

import java.util.Optional;
import ml.dmoyano.argentinaprograma.Portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Moyano David
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

}

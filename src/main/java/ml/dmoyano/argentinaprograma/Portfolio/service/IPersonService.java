/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.service;

import java.util.List;
import ml.dmoyano.argentinaprograma.Portfolio.model.Education;
import ml.dmoyano.argentinaprograma.Portfolio.model.Experience;
import ml.dmoyano.argentinaprograma.Portfolio.model.Person;
import ml.dmoyano.argentinaprograma.Portfolio.model.Profile;
import ml.dmoyano.argentinaprograma.Portfolio.model.Skill;

/**
 *
 * @author Moyano David
 */

public interface IPersonService {
    public List<Person> showPeople();
    public Person findPerson(Long id);
    public void savePerson(Person pers);
    public void deletePerson(Long id);
    public void editPersonProfile(Long id, Profile profile);
    public void addNewExperience(Long id, Experience experience);
    public void deleteExperience(Long id, Experience experience);
    public List<Education> showPersonEducation(Long id);
    public void addNewEducation(Long id, Education education);
    public void deleteEducation(Long id, Education education);
    public void addNewSkill(Long id, Skill skill);
    public void deleteSkill(Long id, Skill skill);
}

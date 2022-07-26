/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.service;

import java.util.List;
import ml.dmoyano.argentinaprograma.Portfolio.model.Education;
import ml.dmoyano.argentinaprograma.Portfolio.model.Experience;
import ml.dmoyano.argentinaprograma.Portfolio.model.Person;
import ml.dmoyano.argentinaprograma.Portfolio.model.Profile;
import ml.dmoyano.argentinaprograma.Portfolio.model.Project;
import ml.dmoyano.argentinaprograma.Portfolio.model.Skill;
import ml.dmoyano.argentinaprograma.Portfolio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Moyano David
 */
@Service
public class PersonService implements IPersonService {

    @Autowired
    public PersonRepository persRepo;

    @Override
    public List<Person> showPeople() {
        return persRepo.findAll();
    }

    @Override
    public Person findPerson(Long id) {
        return persRepo.findById(id).orElse(null);
    }
    
    @Override
    public void savePerson(Person pers) {
        persRepo.save(pers);
    }

    @Override
    public void deletePerson(Long id) {
        persRepo.deleteById(id);
    }

        public void editPersonAboutMe(Long id, String aboutMe) {
        Person pers = persRepo.findById(id).orElse(null);
        pers.setAboutMe(aboutMe);
        persRepo.save(pers);
    }
        
        
    ////revisar si es necesario
    @Override
    public void editPersonProfile(Long id, Profile profile) {
        Person pers = persRepo.findById(id).orElse(null);
        pers.setProfile(profile);
        persRepo.save(pers);
    }

    
///////////Experience/////////////
    @Override
    public void addNewExperience(Long id, Experience experience) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Experience> exp = pers.getExperiences();
        exp.add(experience);
        pers.setExperiences(exp);
        persRepo.save(pers);
    }

    @Override
    public void deleteExperience(Long id, Experience experience) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Experience> exp = pers.getExperiences();
        for (int i = 0; i < exp.size(); i++) { /// cambiar por foreach
            Experience e = exp.get(i);
            if (experience.getId() == e.getId()) {
                exp.remove(i);
            }
        }
        persRepo.save(pers);
    }

    
//////////Education/////////
     @Override
    public List<Education> showPersonEducation(Long id) {
        return persRepo.findById(id).orElse(null).getEducations();
    }
    @Override
    public void addNewEducation(Long id, Education education) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Education> edu = pers.getEducations();
        edu.add(education);
        pers.setEducations(edu);
        persRepo.save(pers);
    }

    @Override
    public void deleteEducation(Long id, Education education) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Education> edu = pers.getEducations();
        for (int i = 0; i < edu.size(); i++) {
            Education e = edu.get(i);
            if (education.getId() == e.getId()) {
                edu.remove(i);
            }
        }
        persRepo.save(pers);
    }

    
///////////Skills/////////////
    public void addNewSkill(Long id, Skill skill) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Skill> ski = pers.getSkills();
        ski.add(skill);
        pers.setSkills(ski);
        persRepo.save(pers);
    }

    public void deleteSkill(Long id, Skill skill) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Skill> ski = pers.getSkills();
        for (int i = 0; i < ski.size(); i++) {
            Skill e = ski.get(i);
            if (skill.getId() == e.getId()) {
                ski.remove(i);
            }
        }
        persRepo.save(pers);
    }
    
    
///////////Projects/////////////
    public void addNewProject(Long id, Project project) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Project> proj = pers.getProjects();
        proj.add(project);
        pers.setProjects(proj);
        persRepo.save(pers);
    }

    public void deleteProject(Long id, Project project) {
        Person pers = persRepo.findById(id).orElse(null);
        List<Project> proj = pers.getProjects();
        for (int i = 0; i < proj.size(); i++) {
            Project e = proj.get(i);
            if (project.getId() == e.getId()) {
                proj.remove(i);
            }
        }
        persRepo.save(pers);
    }

}

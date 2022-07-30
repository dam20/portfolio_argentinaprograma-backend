/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ml.dmoyano.argentinaprograma.Portfolio.controller;

import java.util.List;
import ml.dmoyano.argentinaprograma.Portfolio.model.Education;
import ml.dmoyano.argentinaprograma.Portfolio.model.Experience;
import ml.dmoyano.argentinaprograma.Portfolio.model.Person;
import ml.dmoyano.argentinaprograma.Portfolio.model.Profile;
import ml.dmoyano.argentinaprograma.Portfolio.model.Project;
import ml.dmoyano.argentinaprograma.Portfolio.model.Skill;
import ml.dmoyano.argentinaprograma.Portfolio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Moyano David
 */
@CrossOrigin(origins = "*", maxAge = 3600)
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

    @Autowired
    public PersonService persService;

    //@Autowired
    //public UserService userService;
///////////////////////////////////////////////////////
// Solo para que sea mas entendible los metodos estan//
// definidos con su nombre en español                //
///////////////////////////////////////////////////////

//    @GetMapping("/ver/personas")
//    @ResponseBody
//    public List<Person> listaPersonas() {
//        return persService.showPeople();
//    }

    @GetMapping("/person/{id}")
    @ResponseBody
    public Person buscaPersona (@PathVariable Long id) {
        return persService.findPerson(id);
    }

    @PostMapping("/person/edit/{id}")
    public void editarPersona(@PathVariable Long id, @RequestBody Person newPerson) {
        Person per = persService.findPerson(id);
        per.setName(newPerson.getName());
        per.setBirthDate(newPerson.getBirthDate());
        per.setNationality(newPerson.getNationality());
        per.setLocation(newPerson.getLocation());
        per.getProfile().setBackground(newPerson.getProfile().getBackground());
        per.getProfile().setProfilePicture(newPerson.getProfile().getProfilePicture());

        persService.savePerson(per);
    }
    
//        @DeleteMapping("/delete/{id}")
//    public void deletePersona(@PathVariable Long id) {
//        persService.deletePerson(id);
//    }
    
    @PostMapping("/person/edit/aboutme/{id}")
    public void editarPersonaAcercaDe(@PathVariable Long id, @RequestBody String aboutMe) {
        persService.editPersonAboutMe(id, aboutMe);
    }
    
    
    @PostMapping("/person/new/xp/{id}")
    public void nuevaExperiencia(@PathVariable Long id, @RequestBody Experience experience) {
        persService.addNewExperience(id, experience);
    }

    @PostMapping("/person/delete/xp/{id}")
    public void deleteExperience(@PathVariable Long id, @RequestBody Experience experience) {
        persService.deleteExperience(id, experience);
    }
    
    
    @PostMapping("/person/new/education/{id}")
    public void nuevaEducacion(@PathVariable Long id, @RequestBody Education education) {
        persService.addNewEducation(id, education);
    }

    @PostMapping("/person/delete/education/{id}")
    public void deleteEducacion(@PathVariable Long id, @RequestBody Education education) {
        persService.deleteEducation(id, education);
    }
    
//    @PostMapping("/edit/persona/estudios")
//    public void editarPersonEstudios(@RequestBody Person pers) {
//
//        persService.findPerson(pers.getId());
//    }

    //revisar desde acá



    @PostMapping("/person/new/skill/{id}")
    public void nuevaHabilidad(@PathVariable Long id, @RequestBody Skill skill) {
        persService.addNewSkill(id, skill);
    }

    @PostMapping("/person/delete/skill/{id}")
    public void deleteHabilidad(@PathVariable Long id, @RequestBody Skill skill) {

        persService.deleteSkill(id, skill);
    }


    @PostMapping("/person/new/project/{id}")
    public void nuevoProyecto(@PathVariable Long id, @RequestBody Project project) {

        persService.addNewProject(id, project);
    }

    @PostMapping("/person/delete/project/{id}")
    public void deleteProyecto(@PathVariable Long id, @RequestBody Project project) {

        persService.deleteProject(id, project);
    }   

}

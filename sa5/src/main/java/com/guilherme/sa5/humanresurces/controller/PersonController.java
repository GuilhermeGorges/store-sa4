package com.guilherme.sa5.humanresurces.controller;

import com.guilherme.sa5.humanresurces.entity.Person;
import com.guilherme.sa5.humanresurces.reposiroty.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping("/rh/person")
    public String personList(Model model){
        model.addAttribute("personList", personRepository.findAll());
        return "rh/person/index";
    }

    @GetMapping("/rh/person/new")
    public String newPerson(@ModelAttribute("person")Person person){
        return "rh/person/form";
    }

    @GetMapping("/rh/person/{id}")
    public String updatePerson(@PathVariable("id") Long id, Model model){
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isEmpty()){
            throw new IllegalArgumentException("Invalid Person");
        }
        model.addAttribute("person", optionalPerson.get());
        return "rh/person/form";
    }

    @PostMapping("/rh/person/save")
    public String savePerson(@ModelAttribute("person") Person person){
        personRepository.save(person);
        return "redirect:/rh/person";
    }

    @GetMapping("/rh/person/delete/{id}")
    public String deletePerson(@PathVariable("id") Long id){
        Optional<Person> optionalPerson = personRepository.findById(id);
       if (optionalPerson.isEmpty()){
           throw new IllegalArgumentException("Invalid Person");
        }
        personRepository.delete(optionalPerson.get());
        return "redirect:/rh/person";
    }
}

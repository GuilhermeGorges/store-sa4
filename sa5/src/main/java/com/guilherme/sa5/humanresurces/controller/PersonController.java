package com.guilherme.sa5.humanresurces.controller;

import com.guilherme.sa5.humanresurces.entity.Person;
import com.guilherme.sa5.humanresurces.reposiroty.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
}

package com.guilherme.sa5.humanresurces.controller;

import com.guilherme.sa5.humanresurces.reposiroty.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}

package com.guilherme.sa5.humanresurces.controller;

import com.guilherme.sa5.humanresurces.reposiroty.PersonRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rh/people")
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping
    public String peopleList(Model model){
        model.addAttribute("peopleList", personRepository.findAll());
        return "rh/people/index";
    }
}

package com.guilherme.sa5;

import com.guilherme.sa5.humanresurces.entity.Person;
import com.guilherme.sa5.humanresurces.reposiroty.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitialPopulationBase implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(String... arg) throws Exception {
        Person person1 = new Person("Guilherme");
        person1.setBornDate(LocalDate.of(1992,5,18));
        person1.setEmail("guilherme.gabriel@gmail.com");
        Person person2 = new Person("Luis");
        person2.setBornDate(LocalDate.of(1967,1,18));
        person2.setEmail("luis.carlos@gmail.com");
        personRepository.save(person1);
        personRepository.save(person2);
    }
}

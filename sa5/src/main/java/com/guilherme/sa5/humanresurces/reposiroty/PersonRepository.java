package com.guilherme.sa5.humanresurces.reposiroty;

import com.guilherme.sa5.humanresurces.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

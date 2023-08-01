package com.khanenka.person_controller;

import com.khanenka.PersonRepo;
import com.khanenka.personandrole.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  @Autowired
  PersonRepo personRepo;

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }


  @PostMapping("/add")
  Person newEmployee(@Validated @RequestBody Person person) {

    System.out.println(person);
    return personRepo.save(person);
  }

  @GetMapping("/findall")
  List<Person> all() {
    return (List<Person>) personRepo.findAll();
  }
}

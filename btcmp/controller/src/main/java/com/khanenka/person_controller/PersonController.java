package com.khanenka.person_controller;

import com.khanenka.PersonRepo;
import com.khanenka.personandrole.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  @Autowired
  private PersonRepo personRepo;

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }


  @PostMapping("/add")
  public ResponseEntity<Person> newEmployee(@Validated @RequestBody Person person) {
    Person save = personRepo.save(person);
    return new ResponseEntity<>(save, HttpStatus.CREATED);
  }

  @GetMapping("/findall")
  ResponseEntity<List<Person>> all() {
    Iterable<Person> all = personRepo.findAll();
    return new ResponseEntity(all, HttpStatus.OK);
  }
}

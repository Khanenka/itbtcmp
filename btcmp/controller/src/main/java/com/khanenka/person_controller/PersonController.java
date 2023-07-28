package com.khanenka.person_controller;

import com.khanenka.PersonRepo;
import com.khanenka.personandrole.Btcmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
  @Autowired
  PersonRepo personRepo;
  @GetMapping("/hello")
  public String hello(){
    return "hello";
  }





  @PostMapping("/add")
  Btcmp newEmployee(@Validated @RequestBody Btcmp person) {
//    Btcmp person1=new Btcmp();

    System.out.println(person);
    return personRepo.save(person);
  }

  @GetMapping("/findall")
  List<Btcmp> all() {
    return (List<Btcmp>) personRepo.findAll();
  }

}

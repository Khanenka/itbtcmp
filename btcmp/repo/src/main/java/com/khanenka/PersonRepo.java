package com.khanenka;

import com.khanenka.personandrole.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person,Integer> {

}

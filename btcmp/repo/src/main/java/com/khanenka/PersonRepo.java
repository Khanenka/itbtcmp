package com.khanenka;

import com.khanenka.personandrole.Person;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {

  List<Person> findByOrderByEmailAsc();
}

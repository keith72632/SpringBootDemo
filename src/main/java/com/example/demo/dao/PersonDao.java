package com.example.demo.dao;

import java.util.List;
import java.util.UUID;

import com.example.demo.model.Person;

//Data Access Object. Encapsulates the details of the persistence layer
public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int addPerson(Person person)
    {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
}

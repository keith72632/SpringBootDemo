package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import com.example.demo.model.Person;
import com.example.demo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao)
    {
        this.personDao = personDao;
    }
    public int addPerson(Person person)
    {
        return personDao.addPerson(person);
    }

    public List<Person> getAllPeople()
    {
        return personDao.selectAllPeople();
    }

}

package com.journaldev.dao;

import java.util.List;

import com.journaldev.model.Person;

public interface PersonDAO {

    public void save1(Person person);

    public void save2(Person person);

    public void save3(Person person);

    public Person findOne(Integer id);

    public void delete(Person person);

    public void update1(Person person);

    public void update2(Person person);

    public void update3(Person person);

    public List<Person> list();

}

package com.journaldev.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.journaldev.model.Person;

public class PersonDAOImpl implements PersonDAO {

    private SessionFactory sessionFactory1;
    private SessionFactory sessionFactory2;

    public void setSessionFactory1(SessionFactory sessionFactory1) {
        this.sessionFactory1 = sessionFactory1;
    }

    public void setSessionFactory2(SessionFactory sessionFactory2) {
        this.sessionFactory2 = sessionFactory2;
    }

    public void save1(Person person) {
        Session session1 = this.sessionFactory1.openSession();
        session1.persist(person);
        session1.close();
    }

    public void save2(Person person) {
        Session session1 = this.sessionFactory1.openSession();
        Session session2 = sessionFactory2.openSession();
        Transaction tx = session2.beginTransaction();
        session1.persist(person);
        tx.commit();
        session2.close();
        session1.close();
    }

    public void save3(Person person) {
        Session session1 = this.sessionFactory1.openSession();
        Transaction tx = session1.beginTransaction();
        session1.persist(person);
        tx.commit();
        session1.close();
    }

    @SuppressWarnings("unchecked")
    public List<Person> list() {
        Session session = this.sessionFactory1.openSession();
        List<Person> personList = session.createQuery("from Person").list();
        session.close();
        return personList;
    }

    public Person findOne(Integer id) {
        Session session = this.sessionFactory1.openSession();
        Person p = (Person) session.get(Person.class, id);
        session.close();
        return p;
    }

    public void delete(Person person) {
        Session session = this.sessionFactory1.openSession();
        session.delete(person);
        session.close();
    }

    public void update1(Person person) {
        Session session = this.sessionFactory1.openSession();
        session.update(person);
        session.close();
    }

    public void update2(Person person) {
        Session session1 = this.sessionFactory1.openSession();
        Session session2 = this.sessionFactory1.openSession();
        Transaction tx = session2.beginTransaction();
        session1.update(person);
        tx.commit();
        session2.close();
        session1.close();
    }

    public void update3(Person person) {
        Session session1 = this.sessionFactory1.openSession();
        Transaction tx = session1.beginTransaction();
        session1.update(person);
        tx.commit();
        session1.close();
    }
}

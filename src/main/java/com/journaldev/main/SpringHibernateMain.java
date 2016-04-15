package com.journaldev.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.dao.PersonDAO;
import com.journaldev.model.Person;

public class SpringHibernateMain {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDAO personDAO = context.getBean(PersonDAO.class);
        System.out.println("=================save1()==================");
        // 增加一条数据
        Person person = new Person();
        person.setName("Pankaj");
        person.setCountry("India");
        personDAO.save1(person);
        // System.out.println("================listAll()===================");
        // // 检索所有数据
        // List<Person> list = personDAO.list();
        // for (Person p : list) {
        // System.out.println("所有记录：" + p);
        // }
        System.out.println("================update1()===================");
        // 更新一条Person记录
        person.setCountry("zhongguo");
        personDAO.update1(person);
        System.out.println("更新一条记录India-->zhongguo：" + personDAO.findOne(person.getId()));
        // System.out.println("================delete()===================");
        // // 删除一条Person记录
        // personDAO.delete(person);

        context.close();
    }

    public static void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDAO personDAO = context.getBean(PersonDAO.class);
        System.out.println("=================save2()==================");
        // 增加一条数据
        Person person = new Person();
        person.setName("Pankaj");
        person.setCountry("India");
        personDAO.save1(person);
        // System.out.println("================listAll()===================");
        // // 检索所有数据
        // List<Person> list = personDAO.list();
        // for (Person p : list) {
        // System.out.println("所有记录：" + p);
        // }
        System.out.println("================update2()===================");
        // 更新一条Person记录
        person.setCountry("zhongguo");
        personDAO.update1(person);
        System.out.println("更新一条记录India-->zhongguo：" + personDAO.findOne(person.getId()));
        // System.out.println("================delete()===================");
        // // 删除一条Person记录
        // personDAO.delete(person);

        context.close();
    }

    public static void test3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDAO personDAO = context.getBean(PersonDAO.class);
        System.out.println("=================save3()==================");
        // 增加一条数据
        Person person = new Person();
        person.setName("Pankaj");
        person.setCountry("India");
        personDAO.save3(person);
        // System.out.println("================listAll()===================");
        // // 检索所有数据
        // List<Person> list = personDAO.list();
        // for (Person p : list) {
        // System.out.println("所有记录：" + p);
        // }
        System.out.println("================update3()===================");
        // 更新一条Person记录
        person.setCountry("zhongguo");
        personDAO.update3(person);
        System.out.println("更新一条记录India-->zhongguo：" + personDAO.findOne(person.getId()));
        // System.out.println("================delete()===================");
        // // 删除一条Person记录
        // personDAO.delete(person);

        context.close();
    }
}

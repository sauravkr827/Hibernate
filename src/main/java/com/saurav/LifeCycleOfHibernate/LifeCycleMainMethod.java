package com.saurav.LifeCycleOfHibernate;

import com.saurav.InsertionExample.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LifeCycleMainMethod
{
    public static void main(String[] args) {
        //Life Cycle
        //Transient
        //Persistent
        //Detached
        //Removed


        System.out.println();

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();


        //Creating Student Object

        Student student=new Student();
        student.setId(1000);
        student.setName("Saurav");
        student.setCity("ABC");
        //Above this is now Transient State
        //in next step it will go when we will call Session Object

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(student);



        //Now above things is in Persisten state , bcz , session and for database its available

        student.setName("Kumar");
        tx.commit();
        session.close();
        //here it will not work bcz session is closed

        //Below line is in ditached state
        student.setName("zzzz");


        factory.close();





    }
}

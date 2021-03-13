package com.saurav.GetAndLoadExample;

import com.saurav.InsertionExampleWithAllDataTypes.Address;
import com.saurav.InsertionExample.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetcthDemo
{
    public static void main(String[] args) {

        //get , load example for fetching the data from

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");  //file providing is not compulsory is your hibernate configuration file is chnages in that case we need to give
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();

        //based on id we will fetch data


        Student student=(Student) session.get(Student.class,2);
        System.out.println(student);
        //here no need to do configuration for transactio , because we are not doing saving or updating things

        //We can use load() also instead of get()  but load will through exception(ObjectNotFoundException) if there id is not in database , but get return null.

      /*  Address address=(Address)session.load(Address.class,3);
        System.out.println(address);*/

      //In load() it will not execute select query till when , we r not using variable like below case it will not call to data base, but get will call
        Address address=(Address)session.load(Address.class,3);
        session.close();
      sessionFactory.close();
    }
}

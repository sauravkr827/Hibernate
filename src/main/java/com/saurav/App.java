package com.saurav;

import com.saurav.InsertionExample.Student;
import com.saurav.InsertionExampleWithAllDataTypes.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");  //file providing is not compulsory is your hibernate configuration file is chnages in that case we need to give
       SessionFactory sessionFactory=cfg.buildSessionFactory();
       System.out.println(sessionFactory);

      Student student=new Student();

        student.setId(4);
        student.setName("saurav");
        student.setCity("banglore");
        System.out.println("================"+student);

        Address address=new Address();

        address.setAddressId(3);
        address.setStreet("Ameerpet");
        address.setCity("Hyderbad");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(1234.2);

        //Reading image

        FileInputStream fis=new FileInputStream("src/main/resources/pic.PNG");

        byte[] data=new byte[fis.available()];
        fis.read(data);
        address.setImage(data);

        System.out.println("Adressss======"+address);


        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(address);
        System.out.println("done...............");
       Transaction tx= session.getTransaction();
        tx.commit();
        session.close();


    }


}

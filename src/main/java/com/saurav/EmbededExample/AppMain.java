package com.saurav.EmbededExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain
{
    public static void main(String[] args) {

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory=cfg.buildSessionFactory();




        Student1 st=new Student1();
        st.setId(10);
        st.setName("saurav");
        st.setCity("hyderbad");

        Certificate certificate=new Certificate();
         certificate.setCourse("MCA");
         certificate.setDuration("2years");
        st.setCertificate(certificate);

        Student1 st1=new Student1();
        st1.setId(11);
        st1.setName("saurav kr");
        st1.setCity("Banglore");

        Certificate certificate1=new Certificate();
        certificate1.setCourse("JAVA Full stack");
        certificate1.setDuration("1years");
        st1.setCertificate(certificate1);


        Session session=factory.openSession();
      Transaction t= session.beginTransaction();
        session.save(st1);

        t.commit();
        session.close();


    }
}

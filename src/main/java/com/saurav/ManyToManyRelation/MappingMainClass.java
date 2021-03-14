package com.saurav.ManyToManyRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingMainClass
{

    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();


        Emp emp1=new Emp();
        Emp emp2=new Emp();

        emp1.seteId(3);
        emp1.setName("Saurav kumar");

        emp2.seteId(4);
        emp2.setName("saurav kr");


        Project project=new Project();
        Project project1=new Project();

        project.setpId(11);
        project.setpName("ECommerce site");

        project1.setpId(13);
        project1.setpName("OrderManagement");

        List<Emp> listOfEmp=new ArrayList();
        List<Project> listOfProject=new ArrayList<>();

           listOfEmp.add(emp1);
           listOfEmp.add(emp2);

           listOfProject.add(project);
           listOfProject.add(project1);

           emp2.setProjects(listOfProject);

           project1.setEmpList(listOfEmp);


        Session session=factory.openSession();

        Transaction tx=session.beginTransaction();

        session.save(emp1);
        session.save(emp2);
        session.save(project);
        session.save(project1);

        tx.commit();

        factory.close();
    }
}

package com.saurav.fetchTypeLazyAndEgger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class AppMainMethoClass1
{
    public static void main(String[] args)
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory=cfg.buildSessionFactory();


       /* Question2 questions1 =new Question2();
        questions1.setqId(1);
        questions1.setQuestion("What is Java");

       List<Answer2> list=new ArrayList<>();
        Answer2 answer1 =new Answer2();
        answer1.setaId(101);
        answer1.setAnswer("java is programming language");
        answer1.setQuestion2(questions1);

        Answer2 answer2 =new Answer2();
        answer2.setaId(102);
        answer2.setAnswer("java is oops programming language");
        answer2.setQuestion2(questions1);

        Answer2 answer3 =new Answer2();
        answer3.setaId(103);
        answer3.setAnswer("java has differemt types of framework");
        answer3.setQuestion2(questions1);

        list.add(answer1);
        list.add(answer2);
        list.add(answer3);

        questions1.setAnswer2List(list);

*/
        //Session

        Session session=factory.openSession();

      /*  Transaction t=session.beginTransaction();

         session.save(questions1);
       session.save(answer1);
       session.save(answer2);
       session.save(answer3);

       t.commit();*/


      //Lazy

        Question2 question2=(Question2)session.get(Question2.class,1);

        System.out.println(question2.getqId());
        System.out.println(question2.getQuestion());




        // its lazy because while we are calling Question2 class that time its fetching only id, name
        // but inside Questions2 class have three properties ,thats why its lazy , it will not call till when we not going to call manually that property.
        // if below line i will call it will not call , it will consider only above line.




       // System.out.println(question2.getAnswer2List().size());



        //If we want egger fetch for that we have mention some properties on Answer aatribute of Question class
        //  @OneToMany(mappedBy = "question2",fetch = FetchType.EAGER)

        factory.close();

    }
}

package com.saurav.OneToManyRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToOneMainClass1
{
    public static void main(String[] args) {

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory=cfg.buildSessionFactory();

        //Creating questions
      /*  Questions1 questions1 =new Questions1();
        questions1.setqId(1);
        questions1.setQuestion("What is Java");*/

      /*  List<Answer1> list=new ArrayList<>();
        Answer1 answer1 =new Answer1();
        answer1.setaId(101);
        answer1.setAnswer("java is programming language");
        answer1.setQuestions1(questions1);

        Answer1 answer2 =new Answer1();
        answer2.setaId(102);
        answer2.setAnswer("java is oops programming language");
        answer2.setQuestions1(questions1);

        Answer1 answer3 =new Answer1();
        answer3.setaId(103);
        answer3.setAnswer("java has differemt types of framework");
        answer3.setQuestions1(questions1);

        list.add(answer1);
        list.add(answer2);
        list.add(answer3);

        questions1.setAnswers(list);
*/

        //Session

        Session session=factory.openSession();

        Transaction t=session.beginTransaction();

       /* session.save(questions1);*/
      /* session.save(answer1);
       session.save(answer2);
       session.save(answer3);*/

      Questions1 questions11=(Questions1) session.get(Questions1.class,1);

        System.out.println(questions11.getqId());

        for (Answer1 a:questions11.getAnswers())
        {
            System.out.println(a.getAnswer());

        }


        t.commit();

   /*     Answer1 q=session.get(Answer1.class,101);
        System.out.println(q.getaId()+""+q.getQuestions1());*/

        session.close();

        factory.close();
    }
}

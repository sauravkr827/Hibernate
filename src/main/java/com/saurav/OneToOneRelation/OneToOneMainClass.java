package com.saurav.OneToOneRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMainClass
{
    public static void main(String[] args) {

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory=cfg.buildSessionFactory();

        //Creating questions
        Questions questions=new Questions();
        questions.setqId(1);
        questions.setQuestion("What is Java");

        Answer answer=new Answer();
        answer.setaId(101);
        answer.setAnswer("java is programming language");

        questions.setAnswer(answer);


        //Session

        Session session=factory.openSession();

        Transaction t=session.beginTransaction();

        session.save(questions);
        session.save(answer);

        t.commit();

        Answer q=session.get(Answer.class,101);
        System.out.println(q.getaId()+""+q.getQuestions());

        session.close();

        factory.close();
    }
}

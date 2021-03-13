package com.saurav.OneToOneRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer
{   @Id
    private int aId;
    private String answer;

     @OneToOne(mappedBy = "answer")
     private Questions questions;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "aId=" + aId +
                ", answer='" + answer + '\'' +
                ", questions=" + questions +
                '}';
    }
}

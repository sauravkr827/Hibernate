package com.saurav.OneToManyRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer1
{   @Id
    private int aId;
    private String answer;

     @ManyToOne
     private Questions1 questions1;

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

    public Questions1 getQuestions1() {
        return questions1;
    }

    public void setQuestions1(Questions1 questions1) {
        this.questions1 = questions1;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "aId=" + aId +
                ", answer='" + answer + '\'' +
                ", questions=" + questions1 +
                '}';
    }
}

package com.saurav.OneToOneRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions
{
    @Id
   private int qId;
    private String question;

    @OneToOne
    private  Answer answer;

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "qId=" + qId +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}

package com.saurav.fetchTypeLazyAndEgger;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Answer2 {
    @Id
    private int aId;
    private String answer;

    @ManyToOne
    private Question2 question2;

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

    public Question2 getQuestion2() {
        return question2;
    }

    public void setQuestion2(Question2 question2) {
        this.question2 = question2;
    }

    @Override
    public String toString() {
        return "Answer2{" +
                "aId=" + aId +
                ", answer='" + answer + '\'' +
                ", question2=" + question2 +
                '}';
    }
}

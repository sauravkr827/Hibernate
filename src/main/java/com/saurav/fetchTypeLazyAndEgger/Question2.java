package com.saurav.fetchTypeLazyAndEgger;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question2
{
  @Id
  private int qId;
  private String question;

  @OneToMany(mappedBy = "question2",fetch = FetchType.EAGER)
  private List<Answer2> answer2List;

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

    public List<Answer2> getAnswer2List() {
        return answer2List;
    }

    public void setAnswer2List(List<Answer2> answer2List) {
        this.answer2List = answer2List;
    }


    @Override
    public String toString() {
        return "Question2{" +
                "qId=" + qId +
                ", question='" + question + '\'' +
                ", answer2List=" + answer2List +
                '}';
    }
}

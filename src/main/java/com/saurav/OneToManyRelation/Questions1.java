package com.saurav.OneToManyRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Questions1
{
    @Id
   private int qId;
    private String question;

  //  @OneToMany  //It will create one more table inside db , if we dont want one more table  for the we have use mapped by  like  @OneToMany(mappedBy="question")
    @OneToMany(mappedBy = "questions1")
    private List<Answer1> answers;

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

    public List<Answer1> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer1> answers) {
        this.answers = answers;
    }


    @Override
    public String toString() {
        return "Questions1{" +
                "qId=" + qId +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}



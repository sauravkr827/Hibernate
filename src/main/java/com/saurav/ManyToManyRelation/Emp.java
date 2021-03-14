package com.saurav.ManyToManyRelation;

import javax.persistence.*;
import java.util.List;

@Entity
public class Emp
{

 @Id
 private int eId;
 private String name;

 @ManyToMany
 @JoinTable(name = "emp_project",
         joinColumns = {@JoinColumn(name="eId")} ,
         inverseJoinColumns = {@JoinColumn(name="pId")}
         )

 // Above configuration when we want to change column names of joins table name as well as column name also then using above configuration we can do
 private List<Project> projects;


    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }
}

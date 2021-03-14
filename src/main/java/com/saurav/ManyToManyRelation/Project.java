package com.saurav.ManyToManyRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project
{  @Id
   private int pId;
   private String pName;

   @ManyToMany(mappedBy = "projects")

   private List<Emp> empList;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }


    @Override
    public String toString() {
        return "Project{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", empList=" + empList +
                '}';
    }
}

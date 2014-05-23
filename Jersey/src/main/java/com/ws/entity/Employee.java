package com.ws.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by thiennt on 5/22/14.
 */
@XmlRootElement
@Entity
public class Employee {
    private int empId;
    private String fName;
    private String lName;
    private int age;

    public Employee(int empId, String fName, String lName, int age) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public Employee() {
    }

    @Id
    @Column(name = "EMPLOYEE_ID")
    @SequenceGenerator(name="my_seq", sequenceName="EMPLOYEE_SEQ")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="my_seq")
    public int getEmpId() {
        return empId;
    }

    @XmlElement
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Column(name = "FIRST_NAME")
    public String getfName() {
        return fName;
    }

    @XmlElement
    public void setfName(String fName) {
        this.fName = fName;
    }

    @Column(name = "LAST_NAME")
    public String getlName() {
        return lName;
    }

    @XmlElement
    public void setlName(String lName) {
        this.lName = lName;
    }

    @Column(name = "AGE")
    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.ws.mvc;

/**
 * Created by thiennt on 5/21/14.
 */
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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

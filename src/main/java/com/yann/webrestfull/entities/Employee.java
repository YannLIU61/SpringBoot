package com.yann.webrestfull.entities;

import java.util.Date;

public class Employee {
    private Integer id;
    private String lastName;
    private String mail;
    private Integer gender;
    private Department dept;
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }


    public Employee(Integer id, String lastName, String mail, Integer gender, Department dept, Date birth) {
        this.id = id;
        this.lastName = lastName;
        this.mail = mail;
        this.gender = gender;
        this.dept = dept;
        this.birth = birth;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", gender=" + gender +
                ", dept=" + dept +
                ", birth=" + birth +
                '}';
    }
}

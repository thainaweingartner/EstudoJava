package com.portalstudy.model;

import java.util.Date;
import java.util.Objects;

public class Student {
    private Long student_id;
    private String name;
    private Date birthday;
    private String cpf;
    private String rg;
    private String phone;
    private String user_id;

    public Student(Long student_id, String name, Date birthday, String cpf, String rg, String phone, String user_id) {
        this.student_id = student_id;
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.user_id = user_id;
    }

    public Student(String name, Date birthday, String cpf, String rg, String phone, String user_id) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.user_id = user_id;
    }

    public Student() {
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(student_id, student.student_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", phone='" + phone + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}

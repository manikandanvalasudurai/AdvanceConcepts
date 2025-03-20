package com.alibou.example.AdvanceConcepts.DesignPattern.Prototypes;

public class Student {
    private String name;
    private int age;
    private String batch;

    public Student() {

    }

    public Student(Student student) {
        this.name = name;
        this.age = age;
        this.batch = batch;

    }

    public Student copy(){
        Student student = new Student();
        student.age = this.age;
        student.batch = this.batch;
        student.name = this.name;
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}

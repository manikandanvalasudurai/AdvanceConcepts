package com.alibou.example.AdvanceConcepts.DesignPattern.Prototypes;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        IntelligentStudent intelligentStudent = new IntelligentStudent();

        Student t = student.copy();
        Student t2 = intelligentStudent.copy();

        System.out.println();

        StudentRegistry studentRegistry = new StudentRegistry();
        student.setAge(25);
        student.setName("John");
        student.setBatch("Apr24");

        studentRegistry.add("Apr24student", student);
        studentRegistry.get("Apr24student").copy();


    }
}

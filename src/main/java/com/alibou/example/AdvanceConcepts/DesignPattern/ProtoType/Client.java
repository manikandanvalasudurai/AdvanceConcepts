package com.alibou.example.AdvanceConcepts.DesignPattern.ProtoType;


public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        IntelligentStudent i = new IntelligentStudent();
        Student t = s.copy();
        Student t1 = i.copy();
        System.out.println("DEBUG");


        StudentRegistry sr = new StudentRegistry();
        s.setAge(26);
        s.setName("sbd");
        s.setBatch("Academy");
        sr.addStudent("Academy",s);
        Student newSt = sr.getStudents("Academy").copy();
        System.out.println(newSt);
        System.out.println("Debug");
    }
}

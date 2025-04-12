package com.alibou.example.AdvanceConcepts.DesignPattern.Builder;

public class Client {
    public static void main(String[] args) {
       // Builder b = new Builder();
//        Builder b = Student.getBuilder();
//        b.setName("John wick");
//        b.setAge(23);
//        b.setPsp(90.9);
//        b.setGradYear(2024);
//
//        Student s = b.build();

        Student st = Student.getBuilder().setName("MKV").setAge(27).setPsp(90.0).setBatch("fnbo").build();
    }
}

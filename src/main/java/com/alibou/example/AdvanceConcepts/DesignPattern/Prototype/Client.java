package com.alibou.example.AdvanceConcepts.DesignPattern.Prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);
        Student mkv = studentRegistry.get("Jan23 Beginner").clone();
        mkv.setName("mkv");
        mkv.setAge(26);
        mkv.setPsp(95.20);
        Student stc = studentRegistry.get("Jan23 Beginner").clone();
        stc.setName("stc");
        stc.setAge(26);
        stc.setPsp(95.20);

        IntelligentStudent lingu =(IntelligentStudent) studentRegistry.get("Jan23BeginnerIntelligent").clone();
        lingu.setName("lingu");
        lingu.setAge(26);
        lingu.setPsp(98.20);
        lingu.setIq(50);
        System.out.println("Debug");
    }
    private static void fillRegister(StudentRegistry studentRegistry) {
        //1,create prototype object for every batch
        //Since it is prototype only the common attributes
        Student jan23Beginner = new Student();
        jan23Beginner.setName("Jan23 Beginner");
        jan23Beginner.setAvgBatchPsp(95.10);
        studentRegistry.registerStudent("Jan23 Beginner", jan23Beginner);
        IntelligentStudent jan23BeginnerIntelligent = new IntelligentStudent();
        jan23BeginnerIntelligent.setName("Jan23 Beginner");
        jan23BeginnerIntelligent.setAvgBatchPsp(97.60);
        studentRegistry.registerStudent("Jan23BeginnerIntelligent",jan23BeginnerIntelligent);
    }
}

package com.alibou.example.AdvanceConcepts.DesignPattern.ProtoType;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> students;

    StudentRegistry() {
        students = new HashMap<>();
    }

    public void addStudent(String key,Student student) {
        students.put(key, student);
    }

    public void removeStudent(String key) {
        students.remove(key);
    }

    public Student getStudents(String key) {
        return students.get(key);
    }
}

package com.alibou.example.AdvanceConcepts.DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String,Student> studentsMap = new HashMap<>();

    public void registerStudent(String key,Student student) {
        studentsMap.put(key,student);
    }

    public Student get(String key){
        return studentsMap.get(key);
    }
}

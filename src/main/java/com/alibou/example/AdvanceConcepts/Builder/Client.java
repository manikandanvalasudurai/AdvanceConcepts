package com.alibou.example.AdvanceConcepts.Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setAge(25);
//        builder.setGradYear(2019);
//        builder.setName("Alice");
//        builder.setPhoneNumber("8888828888");
//        Student st = new Student(builder);
//        System.out.println(st.toString());




        Student st = Student.getBuilder().setAge(5).setName("Mkv").setGradYear(2019).setPhoneNumber("4811161644").setUniversityName("SB").setId(21).setBatch("A").setPsp(95.60).build();
        System.out.println("Debug");
        System.out.println(st.toString());
    }
}

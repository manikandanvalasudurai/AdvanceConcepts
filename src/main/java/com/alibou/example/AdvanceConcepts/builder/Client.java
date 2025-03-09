package com.alibou.example.AdvanceConcepts.builder;

public class Client {
    public static void main(String[] args) {
       Student st = Student.getBuilder().setPhoneNumber("5264859711").setGradYear(2021).setAge(30).setBatch("Academy").setName("mkv").setUniversityName("University").build();
//       b.setAge(25);
//       b.setBatch("Acad");
//       b.setPhoneNumber("8524627635");
//       b.setGradYear(2021);
        System.out.println("Student phonenumber is " + st.getPhoneNumber() + "Student gradYear is " + st.getGradYear() + "Student age is " + st.getAge() + "Student batch is " + st.getBatch() + "Student name is " + st.getName() + "Student university is " + st.getUniversityName() + "Student batch is " + st.getBatch());

    }
}

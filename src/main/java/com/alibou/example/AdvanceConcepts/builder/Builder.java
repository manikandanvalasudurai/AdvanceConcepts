//package com.alibou.example.AdvanceConcepts.builder;
//
//public class Builder {
//    String name;
//    int age;
//    double psp;
//    String universityName;
//    String batch;
//    long id;
//    int gradYear;
//    String phoneNumber;
//
//    boolean checkphoneNumber(String phoneNumber) {
//        if (phoneNumber.length() == 10) {
//            return true;
//        }
//        return false;
//    }
//
//    public Student build() {
//        if(gradYear <= 2020){
//            throw  new RuntimeException("Grad year is not valid");
//        }
//        if (!checkphoneNumber(phoneNumber)) {
//            throw  new RuntimeException("Phone number is not valid");
//        }
//        return new Student(this);
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Builder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public Builder setPsp(double psp) {
//        this.psp = psp;
//        return this;
//    }
//
//    public String getUniversityName() {
//        return universityName;
//    }
//
//    public Builder setUniversityName(String universityName) {
//        this.universityName = universityName;
//        return this;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public Builder setBatch(String batch) {
//        this.batch = batch;
//        return this;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public Builder setId(long id) {
//        this.id = id;
//        return this;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public Builder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public Builder setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//        return this;
//    }
//}

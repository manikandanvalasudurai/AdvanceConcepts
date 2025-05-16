package com.alibou.example.AdvanceConcepts.Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;
    public static Builder getBuilder() {
        return new Builder();
    }
    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.batch = builder.getBatch();
        this.id = builder.getId();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();
    }
    public String toString() {
        return "Student { " + "name -> " + name + "  age  -> " + age + " psp -> " + psp + " universityName -> " + universityName + " batch ->  " + batch + " id ->  " + id + " gradYear -> " + gradYear + " phoneNumber -> " + phoneNumber;

    }
    public static class Builder {
        private String name;
        private int age;
        private double psp;
        String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private String phoneNumber;
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Student build(){
            //perform validation checks
            if(gradYear >= 2020){
                throw new RuntimeException("Only below 2019 allowed");
            }
            if(phoneNumber == null || phoneNumber.length() != 10){
                throw new RuntimeException("Only 10 digits are allowed");
            }
            return new Student(this);
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}

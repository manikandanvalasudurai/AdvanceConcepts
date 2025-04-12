package com.alibou.example.AdvanceConcepts.DesignPattern.Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String univName;
    private int rollNo;

    private Student(Builder builder) {
        //validation ends
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.univName = builder.getUnivName();
        this.rollNo = builder.getRollNo();
    }

    public static Builder getBuilder () {
        return new Builder();
    }
    static class Builder {
        private String name;
        private int age;
        private double psp;
        private String batch;
        private int gradYear;
        private String univName;
        private int rollNo;

        public Student build() {
            //validation start
            if(this.getGradYear() >= 2024){
                throw new RuntimeException("Should be less than 2024");
            }
            return new Student(this);
        }


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
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

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public int getRollNo() {
            return rollNo;
        }

        public Builder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }
    }
}

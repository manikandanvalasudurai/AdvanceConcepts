package com.alibou.example.AdvanceConcepts.DesignPattern.ProtoType;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }
    public IntelligentStudent copy() {
        IntelligentStudent copy = new IntelligentStudent(this);
        copy.iq = this.iq;
        return copy;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}

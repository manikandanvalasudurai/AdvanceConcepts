package com.alibou.example.AdvanceConcepts.DesignPattern.Prototypes;

public class IntelligentStudent extends Student {
    private int iQ;

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iQ = intelligentStudent.iQ;
    }

    public IntelligentStudent copy() {
        IntelligentStudent copy = new IntelligentStudent(this);
        return copy;
    }

    public int getiQ() {
        return iQ;
    }

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }
}

package com.codewithakash.java8;

public class Student {

    private String sName;
    private int sMarks;

    public Student(String name, int number) {
        this.sName = name;
        this.sMarks = number;
    }

    public void setsName(String name) {
        this.sName = name;
    }

    public String getsName() {
        return sName;
    }

    public int getsMarks() {
        return sMarks;
    }

    public void setsMarks(int sMarks) {
        this.sMarks = sMarks;
    }

    @Override
    public String toString() {
        return "Student [sName=" + sName + ", sMarks=" + sMarks + "]";
    }

}

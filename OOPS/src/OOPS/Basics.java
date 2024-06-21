package OOPS;

public class Basics {
    public static void main(String[] args) {
        // store 5 roll no
        int[] roll_No = new int[5];

        // stores 5 names
        String[] names = new String[5];

        // data of 5 students: include all in one {roll no, name, marks}
        int[] rollNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

//        Student Rahul;
        Student Rahul = new Student();
        System.out.println(Rahul.rollNo);
    }

    // create a class
    // for every single student
    static class Student {
        int rollNo;
        String name;
        float marks;
    }
}

package OOPS;

// import OOPS.Basics.Student;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 20);
        Student s3 = new Student(123);
    }
    
}

class Student {
    String name;
    int roll;
    int age;

    Student() {
        System.out.println("constructor called");
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        // System.out.println(name);
        // System.out.println(age);
    }
    Student(int roll) {
        this.roll = roll;
        // System.out.println(roll);
    }

}

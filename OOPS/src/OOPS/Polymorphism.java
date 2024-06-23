package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Rudra";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age);
    }
    
}

class Student1 {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

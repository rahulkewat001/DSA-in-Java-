package OOPS;

public class Basics {
    public static void main(String[] args) {
        Studentss s1 = new Studentss();
        s1.name = "Kunal";
        s1.age = 20;
        s1.info();
    }  
}

class Studentss {
    String name;
    int age;

    public void info() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

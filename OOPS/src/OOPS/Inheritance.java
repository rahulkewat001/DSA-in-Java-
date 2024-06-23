package OOPS;

import bank.Account;

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

        bank.Account acc1 = new bank.Account();
        acc1.name = "customer1";
    }
    
}

class Shape {
    String color;
}

class Triangle extends Shape {

}

// Single level inheritance
class Shape1 {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle1 extends Shape1 {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

// Hierarchical inheritance 
class Circle extends Shape1 {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

// Multi-level inhertance
class EquilateralTrianngle extends Triangle1 {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }


}

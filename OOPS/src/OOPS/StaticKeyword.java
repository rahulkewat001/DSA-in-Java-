package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Rudra.school = "CGU";
        Rudra std1 = new Rudra();
        std1.name = "rony";
        System.out.println(std1.school);
    }
}

class Rudra {
    String name;
    static String school;
    
    public static void changeSchool() {
        school = "new School";
    }
}
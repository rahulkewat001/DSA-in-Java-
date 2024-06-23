package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {
        Std s1 = new Std();
        s1.name = "Rahul";
        s1.age = 20;
        Std s2 = new Std(s1);
        
        s2.getInfo();
    }
    
}

class Std {
    String name;
    int age;

    Std(Std s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Std() {

    }

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    
}

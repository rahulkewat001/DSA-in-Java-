package OOPS;

public class ClassesObjects {
    public static void main(String[] args) {
        Pens p1 = new Pens(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Rahul Dev001";
        System.out.println(myAcc.username);

        myAcc.setPass("abcdef");
//        System.out.println(myAcc.password);
    }
    
}

class BankAccount {
    public String username;
    private String password;
    public void setPass(String pwd) {
        password = pwd;
    }
}

class Pens {
    // prop + func
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccout{

}

class Students {
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }
}

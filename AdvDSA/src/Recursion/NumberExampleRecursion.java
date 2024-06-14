package Recursion;

public class NumberExampleRecursion {

    static void print(int n) {
        // base condition
        if(n==8) {
            System.out.println(8);
            return;
        }
        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function call
        print(n + 1);
    }


    public static void main(String[] args) {
        print(1);
    }
}

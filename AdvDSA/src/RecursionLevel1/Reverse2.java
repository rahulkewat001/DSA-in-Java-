package RecursionLevel1;

public class Reverse2 {
    static int sum = 0;
    static void rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        if(n==0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev2(n/10);
    }
    public static void main(String[] args) {

    }
}

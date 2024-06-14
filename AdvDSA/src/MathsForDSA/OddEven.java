package MathsForDSA;

public class OddEven {

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    public static void main(String[] args) {
        int n = 69;
        System.out.println(isOdd(n));
    }
}

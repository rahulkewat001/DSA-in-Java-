package RecursionLevel1;

public class DigitProd {

    static int prod(int n) {
        if(n%10 == n) {
            return n;
        }
        return (n%10) * prod(n/10);
    }
    public static void main(String[] args) {
        int ans = prod(1342);
        System.out.println(ans);
    }
}

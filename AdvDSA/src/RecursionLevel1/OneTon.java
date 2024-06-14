package RecursionLevel1;

public class OneTon {

    static void funRev(int n) {

        if(n == 0) {
            return ;
        }
        funRev(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        funRev(5);
    }
}

package Recursion;

public class SkipChar {
    // skipping char,,,, p= procesed, up= unpro
    static void skip1(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            skip1(p, up.substring(1));
        } else {
            skip1(p + ch, up.substring(1));
        }
    }

    // 2
    static String skip(String up) {
        if(up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }
    public static void main(String[] args) {
//        skip("", "baccdah");
        System.out.println(skip("blaccdah"));
    }
}

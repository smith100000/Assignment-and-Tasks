import java.util.*;
public class q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string:");
        s = sc.next();
        int flag = 0;
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {


            char s1 = s.charAt(i);
            char s2 = s.charAt(j);
            if (s1 != s2) {
                flag = 1;
                break ;
            } else {
                i += 1;
                j -= 1;
            }
        }
        if (flag == 0) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Given string is NOT palindrome");
        }

    }
}

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the String");
        s1=sc.nextLine();
        s2=s1.replaceAll("[aeiouAEIOU]","?");
        System.out.println(s2);
    }
}

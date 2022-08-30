import java.util.Scanner;

public class SortDigitAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string ");
        char ch;
        String s=sc.nextLine();
        String s1="";
        String s2="";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch>='0' && ch<='9')
                s1=s1+ch;
            else
                s2=s2+ch;
        }
        System.out.println(s2+s1);

    }
}

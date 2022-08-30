import java.util.*;
public class q42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s;
        System.out.print("Enter the string : ");
        s= sc.nextLine();
        char ch;
        int i,j,k,l;
        i=0;
        j=0;
        k=0;
        l=0;
        for(int n=0;n<s.length();n++){
            ch=s.charAt(n);
            if(ch>='A' && ch<='z'){
                i+=1;

            } else if (ch>='0' && ch<='9') {
                j+=1;

            } else if (ch==' ') {
                k+=1;

            }
            else{
                l+=1;
            }


        }
        System.out.println("Number of Alphabet Characters : "+i);
        System.out.println("Number of Digits characters : "+j);
        System.out.println("Number of Space characters : "+k);
        System.out.println("Number of Special characters : "+l);

    }
}

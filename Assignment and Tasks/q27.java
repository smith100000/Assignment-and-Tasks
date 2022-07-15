import java.util.Scanner;
public class q27 {
    public static int table(int num,int i)
    {
        if(i==11)
        {
            return 0;
        }
        System.out.println(num +" * "+i+" : " +num*i);
        return table(num,i=++i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int i=1;
        System.out.println(table(num,i));
    }
}

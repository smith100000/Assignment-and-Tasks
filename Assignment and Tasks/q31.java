import java.util.*;
public class q31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of names :");
        n= sc.nextInt();
        String []names=new String[n];
        System.out.println("Enter all the names:");
        for(int i=0;i< names.length;i++){
            names[i]=sc.next();
        }
        Arrays.sort(names);
        System.out.println("Alphabetical order:");
        for(int i=0;i< names.length;i++){
            System.out.print(names[i]+ " ");
        }
    }

}

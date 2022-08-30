import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int temp;
        temp=n;
        int sum;
        sum=0;

        for(int i=1;i<n;i++){

            if(n%i==0){
                sum=sum+i;
            }
        }
        if(temp==sum){
            System.out.println(temp+" is perfect number");
        }
        else{
            System.out.println(temp+" is not perfect number");
        }


    }
}

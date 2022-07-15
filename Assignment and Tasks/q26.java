import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {
        double gross;
        double TA,DA,HRA,PF;
        double bonus;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary:");
        int basic=sc.nextInt();
        TA=0.1*basic;
        DA=0.15*basic;
        HRA=0.2*basic;
        PF=0.12*basic;
        if (basic>=20000) {
            bonus = 0.1 * basic;
            gross = basic + DA + TA + HRA + bonus - PF;
            System.out.println("gross salary is " + gross);

        }
        else{
            bonus = 0.2 * basic;
            gross = basic + DA + TA + HRA + bonus - PF;
            System.out.println("gross salary is " + gross);

        }


    }
}

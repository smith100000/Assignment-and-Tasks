import java.util.Scanner;
public class q25 {
    public static void main(String[] args) {
        double unit;
        double amt,totalAmt,surcharge;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total units consumed:");
        unit=sc.nextDouble();
        if (unit<=50){
            amt= unit*0.50;
        }
        else if(unit <= 150)
        {
            amt = 25 + ((unit-50) * 0.75);
        }
        else if(unit <= 250)
        {
            amt = 100 + ((unit-150) * 1.20);
        }
        else
        {
            amt = 220 + ((unit-250) * 1.50);
        }
        surcharge = amt * 0.20;
        totalAmt = amt + surcharge;
        System.out.println("Electricity Bill is "+totalAmt+ " Rs");


    }
}

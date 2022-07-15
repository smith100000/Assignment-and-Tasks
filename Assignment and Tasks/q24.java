import java.util.Scanner;
public class q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are u married?(y/n):");
        char c=sc.next().charAt(0);
        if (c=='y') {
            System.out.println("The company insured its policy");
        }

        if(c=='n'){
            System.out.println("Enter the gender(male/female):");
            String gender= sc.next();
            System.out.println("Enter the age:");
            int age=sc.nextInt();
            if (gender.equals("male") && age>30){
                System.out.println("The company insured its policy");
            } else if (gender.equals("female") && age>25) {
                System.out.println("The company insured its policy");
            }
            else{
                System.out.println("The company  NOT insured its policy");
            }

            }

    }
}

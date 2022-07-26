
import java.util.Scanner;

public class Task2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);

        MAIN:while (true)
        {
            System.out.println("--------NUMBER-SYSTEM-CONVERSION-------");
            System.out.println ("--------------------------------------");
            System.out.println ("1) Decimal");
            System.out.println ("2) Binary");
            System.out.println ("3) Hexadecimal");
            System.out.println ("4) Octal");
            System.out.println ("0) Exit");
            System.out.println ("--------------------------------------");

            System.out.print ("Enter Your Choice: ");
            int inp = sc.nextInt ();
            switch (inp) {
                case 1:

                    int decimal;
                    System.out.println("\nEnter the Decimal number :");
                    decimal = sc.nextInt();
                    A:
                    while (true) {
                        System.out.println("---------------------");
                        System.out.println("1- Binary");
                        System.out.println("2- Hexadecimal");
                        System.out.println("3- Octal");
                        System.out.println("0- Exit");
                        System.out.println("---------------------");

                        int inp1 = sc.nextInt();

                        switch (inp1) {
                            case 1:
                                System.out.println("Converting  Decimal to Binary:");
                                Decimal_Bin(decimal);
                                break A;
                            case 2:
                                System.out.println("Converting  Decimal to Hexadecimal:");
                                Decimal_Hex(decimal);
                                break A;

                            case 3:
                                System.out.println("Converting  Decimal to Octal:");
                                Decimal_Oct(decimal);
                                break A;
                            case 0:
                                break A;
                            default:
                                System.out.println("Invalid input");
                        }

                    }


                    break;

                case 2:
                    String binary;
                    System.out.println("\nEnter the Binary number :");
                    binary = sc.next();
                    int flag = 0;
                    for (int i = 0; i < binary.length(); i++) {
                        char ch = binary.charAt(i);
                        if (ch == '0' || ch == '1') {
                            continue;

                        } else {
                            flag = 1;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("------Invalid Binary Number------");
                        System.out.println("Binary number should be either 0 or 1");
                        System.out.println();
                        break;
                    }


                    B:
                    while (true) {
                        System.out.println("---------------------");
                        System.out.println("1- Decimal");
                        System.out.println("2- Hexadecimal");
                        System.out.println("3- Octal");
                        System.out.println("0- Exit");
                        System.out.println("---------------------");

                        int inp2 = sc.nextInt();

                        switch (inp2) {
                            case 1:
                                System.out.println("Converting  Binary to Decimal:");
                                Binary_Dec(binary);
                                break B;
                            case 2:
                                System.out.println("Converting  Binary to Hexadecimal:");
                                Binary_Hex(binary);
                                break B;

                            case 3:
                                System.out.println("Converting  Binary to Octal:");
                                Binary_Oct(binary);
                                break B;
                            case 0:
                                break B;
                            default:
                                System.out.println("Invalid input");
                        }

                    }

                    break;

                case 3:
                    String hexadecimal;
                    System.out.println("\nEnter the Hexadecimal number :");
                    hexadecimal = sc.next();
                    int n = hexadecimal.length();
                    int flag1 = 0;
                    for (int i = 0; i < n; i++) {

                        char ch = hexadecimal.charAt(i);
                        if ((ch < '0' || ch > '9')
                                && (ch < 'A' || ch > 'F')) {
                            flag1 = 1;

                        }
                    }
                    if (flag1 == 1) {
                        System.out.println("------Invalid Hexadecimal number------");
                        System.out.println();
                        break;
                    }


                    C:
                    while (true) {
                        System.out.println("---------------------");
                        System.out.println("1- Decimal");
                        System.out.println("2- Binary");
                        System.out.println("3- Octal");
                        System.out.println("0- Exit");
                        System.out.println("---------------------");

                        int inp3 = sc.nextInt();

                        switch (inp3) {
                            case 1:
                                System.out.println("Converting Hexadecimal to Decimal:");
                                Hexadecimal_Dec(hexadecimal);
                                break C;
                            case 2:
                                System.out.println("Converting Hexadecimal to Binary:");
                                Hexadecimal_Bin(hexadecimal);
                                break C;

                            case 3:
                                System.out.println("Converting Hexadecimal to Octal:");
                                Hexadecimal_Oct(hexadecimal);
                                break C;
                            case 0:
                                break C;
                            default:
                                System.out.println("Invalid input");
                        }

                    }

                    break;
                case 4:
                    String octal;
                    System.out.println("\nEnter the Octal number :");
                    octal = sc.next();
                    int flag2 = 0;
                    int number1 = Integer.parseInt(octal);

                    while (number1 > 0) {
                        if (number1 % 10 >= 7) {
                            flag2 = 1;
                        }

                        number1 = number1 / 10;
                    }

                    if (flag2==1){
                        System.out.println("-----Invalid octal number-----");
                        System.out.println();
                        break;

                    }

                    D:while (true)
                    {
                        System.out.println ("---------------------");
                        System.out.println ("1- Decimal");
                        System.out.println ("2- Binary");
                        System.out.println ("3- Hexadecimal");
                        System.out.println ("0- Exit");
                        System.out.println ("---------------------");

                        int inp4 = sc.nextInt ();

                        switch (inp4)
                        {
                            case 1:
                                System.out.println("Converting Octal to Decimal:");
                                Octal_Dec(octal);

                                break D;
                            case 2:
                                System.out.println("Converting Octal to Binary:");
                                Octal_Bin(octal);

                                break D;

                            case 3:
                                System.out.println("Converting Octal to Hexadecimal:");
                                Octal_Hex(octal);

                                break D;
                            case 0:break D;
                            default:
                                System.out.println ("Invalid input");
                        }

                    }

                    break ;
                case 0:
                    break MAIN;
                default:
                    System.out.println ("Invalid Choice please enter valid choice");
            }
        }
    }

    static void Decimal_Hex(int num)
    {
        String Hex;
        Hex=Integer.toHexString(num);
        System.out.println("Hexadecimal Value : "+Hex);


    }
    static void Decimal_Bin(int num){
        String Bin;
        Bin=Integer.toBinaryString(num);
        System.out.println ("Binary Value : "+Bin);
        System.out.println();
    }


    static void Decimal_Oct(int num)
    {
        String Oct;
        Oct=Integer.toOctalString(num);
        System.out.println("Octal Value : "+Oct);
        System.out.println();
    }
    static void Octal_Dec(String num)
    {
        int Dec;
        Dec=Integer.parseInt(num,8);
        System.out.println("Decimal value : "+Dec);
        System.out.println();

    }
    static void Octal_Bin(String num)
    {
        int Dec;
        Dec=Integer.parseInt(num,8);
        String Bin;
        Bin=Integer.toBinaryString(Dec);
        System.out.println("Binary Value : "+Bin);
        System.out.println();

    }
    static void Octal_Hex(String num)
    {
        int Dec;
        Dec=Integer.parseInt(num,8);
        String Hex;
        Hex=Integer.toHexString(Dec);
        System.out.println("Binary Value : "+Hex);
        System.out.println();

    }
    static void Hexadecimal_Dec(String num)
    {
        int Dec;
        Dec=Integer.parseInt(num,16);
        System.out.println("Decimal value : "+Dec);
        System.out.println();

    }
    static void Hexadecimal_Bin(String num)
    {
        int Dec;
        Dec=Integer.parseInt(num,16);
        String Bin;
        Bin=Integer.toBinaryString(Dec);
        System.out.println("Binary Value : "+Bin);
        System.out.println();

    }
    static void Hexadecimal_Oct(String num)
    {
        int Dec;
        Dec=Integer.parseInt(num,16);
        String Oct;
        Oct=Integer.toOctalString(Dec);
        System.out.println("Octal value : "+Oct);
        System.out.println();

    }
    static void Binary_Dec(String num)
    {
        int Dec;
        Dec=Integer.parseInt(num,2);
        System.out.println("Decimal Value : "+Dec);
        System.out.println();


    }
    static void Binary_Hex(String num)
    {
        String Hex;
        int d1;
        d1=Integer.parseInt(num,2);
        Hex=Integer.toHexString(d1);
        System.out.println("Hexadecimal Value : "+Hex);
        System.out.println();

    }
    static void Binary_Oct(String num)
    {
        int d1;
        d1=Integer.parseInt(num,2);
        String Oct;
        Oct=Integer.toOctalString(d1);
        System.out.println("Octal Value : "+Oct);
        System.out.println();

    }
}


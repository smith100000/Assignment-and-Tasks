import java.util.Arrays;
import java.util.Scanner;
public class q32 {
    public static int countDist(int []num){
        int res;
        res=0;
        Arrays.sort(num);
        int n= num.length;
        for(int i=0;i< num.length;i++)
        {
            while (i < n - 1 &&
                    num[i] == num[i + 1])
            {
                i++;
            }
            res++;
        }
        return res;

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }


        System.out.println("Total number of unique elements in array :" + countDist(arr));
    }

    }





import java.util.Scanner;
public class q30 {
    public static void addAverage(int []num){
        int sum;
        float avg;
        sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("sum of array elements:"+sum);
        avg=(float)sum/ num.length;
        System.out.println("average of array elements:"+avg);
        return;
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

        addAverage(arr);


    }
}

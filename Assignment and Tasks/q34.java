import java.util.*;
public class q34 {
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter numbers to array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        int []even=new int[evenSize];
        int []odd=new int [oddSize];
        int j=0,k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                odd[j++]=arr[i];
            }
            else{
                even[k++] =arr[i];
            }
        }
        System.out.println("Odd number array : ");
        printArray(odd);
        System.out.println("Even array : " );
        printArray(even);
    }
}
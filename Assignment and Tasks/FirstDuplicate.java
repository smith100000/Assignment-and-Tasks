import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size ");
        n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();//First creates empty hash set
        int index=-1;
        for(int i=n-1; i>=0 ; i--){
            if(set.contains(arr[i]))//if element is already in hash set ,update index
                index=i;
            else
                set.add(arr[i]);//Else add element in hash set
        }
        if(index==-1)
            System.out.println("no repeating elements");
        else
            System.out.println("first duplicate element is "+arr[index]);
    }
}

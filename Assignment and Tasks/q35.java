import java.util.*;
public class q35 {
    public static void find_max_min(int[] num) {
        int n = num.length;
        int res1 = num[0];
        int res2 = num[0];
        for (int i = 1; i < n; i++) {
            res1 = Math.min(res1, num[i]);
            res2 = Math.max(res2, num[i]);

        }
        System.out.println("minimum element in array: " + res1);
        System.out.println("maximum element in array: " + res2);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        find_max_min(arr);

    }
}

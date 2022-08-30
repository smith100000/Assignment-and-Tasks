import java.util.Scanner;
public class OcurrenceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        String s;
        System.out.print("Enter the string ");
        s = sc.nextLine();
        int arr[] = new int[126];//First creates empty array with array size 126
        //{0,0,0,0,0,0,----------- upto 126}
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            arr[ch] = arr[ch] + 1; //count every character frequency and store in arr
        }
        System.out.println("The occurrences of each character in string is");
        for (int i=0;i<126;i++){
            if(arr[i]!=0)
                System.out.println((char)i+" --- "+arr[i]);
        }
    }
}

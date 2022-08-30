public class RotateArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int k=2;
        int p=0;
        while(p<k){
            int last=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=last;
            p++;
        }
        for(int item:arr){
            System.out.print(item+" ");
        }
    }
}

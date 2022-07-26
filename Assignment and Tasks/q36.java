import java.util.*;
public class q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q36 obj = new q36();
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        obj.Input(arr, n);
        int ch = -1;
        do {
            System.out.println("----------------------------------");
            System.out.println("1-Insertion");
            System.out.println("2-Deletion");
            System.out.println("3-Display");
            System.out.println("4-sum of array");
            System.out.println("5-Average of array");
            System.out.println("6-Search");
            System.out.println("0-Exit");
            System.out.println("----------------------------------");
            System.out.println("Enter  your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("original array elements: ");
                    obj.Display(arr);

                    System.out.println("Enter Index new Element to be inserted: ");
                    int index1 = sc.nextInt();
                    n = arr.length;
                    if (index1 < 0 || index1 > n) {
                        System.out.println("Choose correct position Insertion NOT possible");
                    } else {
                        System.out.println("Enter the new Element to be inserted");
                        int value = sc.nextInt();
                        arr = obj.insertX(arr, n, index1, value);
                        System.out.println("\nArray with " + value + " inserted at position " + index1 +
                                ":\n" + Arrays.toString(arr));
                    }
                    break;
                }


                case 2: {
                    System.out.println("Original Array before deletion :" + Arrays.toString(arr));
                    System.out.println("Enter the Index of Element to be deleted");
                    int p = sc.nextInt();
                    if (arr == null || p < 0
                            || p >= arr.length) {
                        System.out.println("DELETION NOT POSSIBLE");
                        System.out.print("Original Array:");
                    }
                    arr = obj.removeTheElement(arr, p);
                    System.out.println(Arrays.toString(arr));
                    break;
                }


                case 3: {
                    obj.Display(arr);
                    break;

                }
                case 4: {
                    if (arr.length > 1) {
                        System.out.println("sum of array : ");
                        obj.sum(arr);
                    } else {
                        System.out.println("sum");
                    }
                    break;
                }
                case 5: {
                    if (arr.length > 1) {
                        System.out.println("Average of array is :");
                        average(arr);
                    } else {
                        System.out.println("average NOT possible for empty Array");
                    }
                    break;
                }
                case 6:{
                    int n1;
                    System.out.println("Enter the element to be searched");
                    n1= sc.nextInt();

                    check(arr,n1);
                    break;
                }


                case 0:
                    System.out.println("....Thanks....");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        } while (ch != 0);


    }

    public int[] insertX(int[] arr, int n, int pos, int val) {
        int[] newarr;
        if (pos > n) {
            newarr = new int[pos + 1];
            for (int i = 0; i < pos + 1; i++) {
                if (i < n)
                    newarr[i] = arr[i];
                if (i == pos) {
                    newarr[pos] = val;
                }
            }
        } else {
            newarr = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                if (i < pos)
                    newarr[i] = arr[i];
                else if (i == pos) {
                    newarr[i] = val;
                } else {
                    newarr[i] = arr[i - 1];
                }
            }
        }
        return newarr;
    }
    public void Input(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

    }
    public void Display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] proxyArray = new int[arr.length - 1];

        // copy all the elements in the original to proxy array except the one at index
        for (int i = 0, k = 0; i < arr.length; i++) {

            // check if index is crossed, continue without copying
            if (i == index) {
                continue;
            }

            // else copy the element
            proxyArray[k++] = arr[i];
        }
        return proxyArray;
    }


    public void sum(int[] arr) {
        int s = 0;
        for (int j : arr) {
            s = s + j;
        }
        System.out.println(s);
    }

    static void average(int[] arr) {
        float s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        System.out.println(s / arr.length);
    }
    private static void check(int[] arr, int n1)
    {
        int flag=0;
        for(int i = 0; i < n1; i++) {
            if (arr[i] == n1) {
                System.out.println("Element "+n1+" found at "+(i+=1)+" position");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element "+n1+" not found");
        }



    }
}

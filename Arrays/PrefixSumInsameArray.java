import java.util.Scanner;

public class PrefixSumInsameArray{

    static int[] makeprefixSumArray(int arr[]){
        int  n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array: ");
        printArray(arr);

        int pref[] = makeprefixSumArray(arr);
        printArray(pref);

    }

}

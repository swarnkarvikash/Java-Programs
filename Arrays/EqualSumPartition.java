import java.util.Scanner;

public class EqualSumPartition {

    static int[] makeprefixSumArray(int arr[]){
        int  n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] += arr[i-1];
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
        int arr[] = new int[n+1];

        System.out.println("Enter "+n+" elements");
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        } 
    }
}

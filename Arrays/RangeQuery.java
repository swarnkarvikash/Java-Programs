import java.util.Scanner;

public class RangeQuery{

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

        System.out.println("Enter No. of Queries: ");
        int q = sc.nextInt();

        int[] prefixSum = makeprefixSumArray(arr);

        while(q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = prefixSum[r] - prefixSum[l-1];

            System.out.println("Sum "+sum);
        }
    }

}

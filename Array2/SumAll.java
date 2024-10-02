import java.util.Scanner;

public class SumAll {
    public static int SumAllValues(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int s = SumAllValues(arr);
        System.out.println(s);
    }
}

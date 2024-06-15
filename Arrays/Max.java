import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of element: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element in Array: ");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
         for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
         }
         System.out.println("Maximum element is: "+ max);

    }
}

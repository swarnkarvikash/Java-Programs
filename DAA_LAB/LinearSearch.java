import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element in Array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int A = 0;
        System.out.println("Enter Key: ");
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(key == arr[i]){
                A = i; 
            }
        }
        System.out.println(key + " found at " + A);
    }
}

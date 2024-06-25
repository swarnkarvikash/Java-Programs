import java.util.*;
import java.lang.*;

public class NonDeacreasingOrder {

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans[] = new int[n];
        int k = 0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                    ans[k++] = arr[left] * arr[left];
                    left++;
            }else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = sortSquares(arr);

        for(int i=ans.length-1;i >= 0;i--){
            System.out.print(ans[i]+" ");
        }
    }
}

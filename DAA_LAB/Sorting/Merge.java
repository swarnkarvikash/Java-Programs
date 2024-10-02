import java.util.*;

public class Merge {
    
    public static void MergeSort(arr, lb, ub){
          if(lb == ub){
            return;
          }
          else if(lb < ub){
            int mid  = (lb+ub)/2;
            MergeSort(arr,lb,mid);
            MergeSort(arr,mid+1,ub);
            Merge(arr,lb,mid,ub);
          }
    }

    Public static void Merge(arr,lb,mid,ub){
        int i,j,k;
        i=lb;j=mid+1;k=ub;
        int m = arr.length;
        int barr[] = new int[m];
       }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sie of an Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("Array after Sorting: ");
    }
    
}

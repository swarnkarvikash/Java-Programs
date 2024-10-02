import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Key: ");
        int key = sc.nextInt();
        int beg = 0;
        int end = n-1;
        int mid = (beg+end)/2;
        while(beg <= end && arr[mid] != key){
            if(key > arr[mid]){
                beg = mid+1;
            }
            if(key < arr[mid]){
                end = mid-1;
            }
            mid = (beg+end)/2;
            if(key == arr[mid]){
                System.out.println(key+" found at "+ mid);
            }
        }
    }
}

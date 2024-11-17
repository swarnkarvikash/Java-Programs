import java.util.Scanner;

public class BubbleSorting {
    
    public static void BubbleSort(int a[]){
        int n = a.length;

        //n-1 iteration/passes
        for(int i=0;i<n-1;i++){
            for(int j = 0;j < n-i-1; j++){
                /* last i element are already at correct sorted,
                so need to check them
                */
                if(a[j] > a[j+1]){
                    //swap a[j], a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                } 
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n] ;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        BubbleSort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

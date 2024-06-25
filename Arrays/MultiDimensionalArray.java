import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows and Columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int [m][n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array: ");
        printArray(arr);
    }
} 

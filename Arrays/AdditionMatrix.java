import java.util.Scanner;

public class AdditionMatrix {

    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    static void AddTwoMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){

        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input- Additon Not possible: ");
            return;
        }
    
        int[][] sum = new int[r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        printArray(sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr= new int[r1][c1];
        System.out.println("Enter "+r1*c1+" Elements: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter order of Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2= new int[r2][c2];
        System.out.println("Enter "+r2*c2+" Elements: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        printArray(arr);

        System.out.println("Matrix 2: ");
        printArray(arr2);

        System.out.println("Resultant Matrix is: ");
        AddTwoMatrix(arr, r1, c1, arr2, r2, c2);

    }
}
  
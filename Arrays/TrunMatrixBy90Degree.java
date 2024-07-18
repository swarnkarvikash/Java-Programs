import java.util.Scanner;

public class TrunMatrixBy90Degree {

    static void reverseEachRow(int[][] arr, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void PrintMatrix(int[][] arr, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] arr){
        int i=0, j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void transposeInplace(int[][] arr, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void turnMatrix(int arr[][], int r, int c){ // turn in clockwise direction

        transposeInplace(arr, r, c);

        for(int i=0;i<r;i++){
        reverseArray(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int [r][c];
        System.out.println("Enter "+r*c+" elements in matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix");
        PrintMatrix(arr, r, c);

        System.out.println("Rotate matrix: ");
        turnMatrix(arr, r, c);
        PrintMatrix(arr, r, c);
        }
}

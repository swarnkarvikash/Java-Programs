import java.util.Scanner;

public class ReverseEachRow {

    static void reverseEachRow(int[][] arr, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of row and column: ");
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" Elemnets in array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultant matrix is: ");
        reverseEachRow(arr, r, c);
    }
}

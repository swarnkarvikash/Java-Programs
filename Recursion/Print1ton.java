import java.util.Scanner;

public class Print1ton {
     
    static void PrintIncreasing1toN(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }

        PrintIncreasing1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintIncreasing1toN(n);
    }
}

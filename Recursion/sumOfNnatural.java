import java.util.Scanner;

public class sumOfNnatural {

    static int printSum(int n){
        if(n == 0){
            return 0;
        }
        return printSum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(printSum(num));
    }
}

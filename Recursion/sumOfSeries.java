import java.util.Scanner;

public class sumOfSeries {//1-2+3-4+5 = 3

    static int Sum(int n){
        if(n ==0){
            return 0;
        }
        if(n%2 == 0){
            return Sum(n-1)-n;
        }
        return  Sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Sum(num));
    }
}

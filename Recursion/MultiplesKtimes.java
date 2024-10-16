import java.util.Scanner;

public class MultiplesKtimes {

    static void Kmultiples(int num, int k){
        if(k == 0){
            return;
        }
        Kmultiples(num, k-1);
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        Kmultiples(num, k)
;    }
}

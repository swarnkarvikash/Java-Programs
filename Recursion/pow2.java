import java.util.Scanner;


public class pow2 {

    static int pow2(int p, int q){
        if(q == 0){
            return 1;
        }
        if(q%2 == 0){
            int smallPow = pow2(p,q/2);
            return smallPow*smallPow;
        }else{
            int smallPow = pow2(p,q/2);
            return p*smallPow*smallPow;
        }
    }
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int p = sc.nextInt();
         int q = sc.nextInt();
         System.out.println(pow2(p, q));
    }
}

import java.util.Scanner;

public class pow {

    static int Power(int p, int q){  //TC => O(q)
        //base case
        if(q == 0){
            return 1;
        }

        //recursive work
        return Power(p, q-1) * p;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int p = sc.nextInt();
         int q = sc.nextInt();
         System.out.println(Power(p, q));
    }
}

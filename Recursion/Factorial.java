public class Factorial {

    static int fact(int n){
        //base case
        if(n == 0)  return 1;
        //subproblem
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}

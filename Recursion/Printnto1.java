import java.util.Scanner;

public class Printnto1 {
    
    static void PDnTo1(int n){
        //base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n-1);
        
        //recursive work
        PDnTo1(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PDnTo1(n);
    }
}

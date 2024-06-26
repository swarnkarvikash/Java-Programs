class A{
    int a;
    double b;
    String c;
    private A(){
        a = 10;
        b = 30.56;
        c = "Vikash";
        System.out.println(a+" "+b+" "+c);
    }
    }
 public class PrivateConstructor{
    public static void main(String[] args) {
        A ref = new A(); //due to private constructor it cann't access
    }
 }
 
class A{
    int a; double b; String c;
    A(){
        a = 100;
        b = 45.32;
        c = "Vikash";
    }
    A(int x){
        a = x;
    }
    A(double y, String z){
        b = y;
        c = z;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        A ref = new A();
        A ref2 = new A(10);
        A ref3 = new A(23.89, "Ankush");
        System.out.println(ref.a+" "+ref.b+" "+ref.c);
        System.out.println(ref2.a);
        System.out.println(ref3.b+" "+ref3.c);
    }

}

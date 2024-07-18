class A{
    A(){
        System.out.println("Vikash");
    }
    int a = 10;
    void Disp(){
        System.out.println("Hello vikash");
    }
}
class B extends A{
    B(){
        System.out.println("Aman");
    }
    int a = 20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
    void Disp(){
        super.Disp();
        System.out.println("Hello Learner");
    }
}
public class Super {
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
        ref.Disp();
    }
}

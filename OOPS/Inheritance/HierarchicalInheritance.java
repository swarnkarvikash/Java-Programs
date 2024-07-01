class A{
    void input(){
        System.out.println("Enter your name: ");
    }
}
class B extends A{
    void Show(){
        System.out.println("My Name is Vikash");
    }
}
class C extends A{
    void Disp(){
        System.out.println("My name is Aman");
    }
}

public class HierarchicalInheritance {
        public static void main(String[] args) {
            B r1 = new B();
            C r2 = new C();
            r1.input(); r1.Show();
            r2.input(); r2.Disp();
        }
}

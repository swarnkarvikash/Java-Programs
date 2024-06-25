class A{
    int a;
    String b;
    boolean c;
    A(){
        a = 100;
        b = "Vikash";
        c = true;
    }

    void Display(){
        System.out.print(a+" "+b+" "+c);
    }
}

public class DefaultConstructor {
    public static void main(String[] args){
        A ref = new A();
        ref.Display();
    }
}



class B {

    int a;
    String name;
    B(){
        a = 0;
        name = null;
    }
    void show(){
        System.out.println(a+" "+name);
    }
}

public class ConstructorTest{
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}

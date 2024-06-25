class A{
    int x,y;
    A(int a, int b){//parametrized
        x = a;
        y = b;
    }
    void show(){
        System.out.println(x+" "+y);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        A ref = new A(100, 200);
        ref.show();
    }
}

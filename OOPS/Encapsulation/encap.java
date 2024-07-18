class A{
    private int value;
    public void setValue(int x){
        value = x;
    }

    public int getvalue(){
        return value;
    }
}

public class encap {
    public static void main(String[] args) {
        A r = new A();
        r.setValue(100);
        System.out.println(r.getvalue());
    }
}

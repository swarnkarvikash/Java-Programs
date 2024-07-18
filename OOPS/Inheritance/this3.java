public class this3 {
    this3(){
        System.out.println("hello");
    }
    this3(int a){
        this();
        System.out.println(a);
    }
    public static void main(String[] args) {
        this3 r = new this3(50);
    }

}

public class this2 {
    int a;
     this2(int a){
        this.a = a;
     }
     void show(){
        System.out.println(a);
     }
     public static void main(String[] args) {
        this2 r = new this2(100);
        r.show();
     }
    
}

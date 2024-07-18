class shape{
    void draw(){
        System.out.println("Cann't say shape type");
    }
}
class square extends shape{
    @Override
    void draw(){
        super.draw(); 
        System.out.println("Square Shape");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        shape r = new square();
        r.draw();
    }
}

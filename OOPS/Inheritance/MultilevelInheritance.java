class A{ //Super class
    int a,b,c;
    void add(){
        a = 10;
        b = 20;
        c =a + b;
        System.out.println("Sum: "+c);
    }
    void sub(){
        a = 10;
        b = 20;
        c =a - b;
        System.out.println("Sub: "+c);
    }
}

class B extends A{ //sub1 class
    void multi(){
        a=10;b=20;
        c=a*b;
        System.out.println("Multiplication: "+c);
    }
    void div(){
        a=10;b=20;
        c=a/b;
        System.out.println("Division: "+c);
    }
}

class C extends B{
    void rem(){
        a=10;b=20;
        c=a%b;
        System.out.println("Remainder: "+c);
    }
}

public class MultilevelInheritance {
        public static void main(String[] args) {
            C ref = new C();
            ref.add();
            ref.sub();
            ref.multi();
            ref.div();
            ref.rem();
         }
}

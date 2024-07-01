class student{ // super class
    int roll, marks;
    String name;

    void input(){
        System.out.println("Enter roll, name & marks: ");
    }
}

class vikash extends student{ // sub class
    void display(){
        roll = 1;
        name = "Vikash";
        marks = 89;
        System.out.println(roll+" "+name+" "+marks);
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        vikash ref = new vikash();
        ref.input();
        ref.display();
    }

}

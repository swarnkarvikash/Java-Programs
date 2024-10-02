import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list "+ list);
        Collections.reverse(list);
  //      reverseList(list);
        System.out.println("Reversed List " + list);
    }
    
}

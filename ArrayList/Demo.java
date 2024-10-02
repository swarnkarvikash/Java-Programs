import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        //Integer i = Integer.valueOf(4);

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(2);
        l1.add(3);
        l1.add(4);//add at the and of list
        l1.add(1, 100);

        System.out.println(l1.get(2));
        System.out.println();;
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1);
        l1.set(1,10);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);


        System.out.println(l1.remove(Integer.valueOf(3))); //it return boolean type
        System.out.println("remove"+l1);

        boolean ans = l1.contains(Integer.valueOf(4));
        System.out.println(ans);

        ArrayList l = new ArrayList();
        l.add("vikash");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
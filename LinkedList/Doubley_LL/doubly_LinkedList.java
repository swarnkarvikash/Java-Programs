

public class doubly_LinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void display2(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display3(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        a.prev = null;
        display(a);
        display2(e);
        display3(c);
    }
}

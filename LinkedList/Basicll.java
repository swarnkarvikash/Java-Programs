

public class Basicll {

    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;
        

    }

    public static void displayr(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data; // value
        Node next; //address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8); 
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        insertAtEnd(a,87);

        display(a);
    }
}

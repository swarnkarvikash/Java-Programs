

public class nThNodeFromEnd {
    public static Node nthNode(Node head, int pos){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size-pos+1;
        //mth node from start
        temp = head;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNode2(Node head, int pos){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=pos;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
         Node a = new Node(100);
         Node b = new Node(13);
         Node c = new Node(4);
         Node d = new Node(5);
         Node e = new Node(12);
         Node f = new Node(10); 
         a.next = b;
         b.next = c;
         c.next = d;
         d.next = e;
         e.next = f;

         Node temp = nthNode(a, 2);
         System.out.println(temp.data);
         Node temp2 = nthNode2(a, 3);
         System.out.println(temp2.data);
    }

}

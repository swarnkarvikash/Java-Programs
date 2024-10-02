public class Implementation {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null ){
                head = temp;
            }
            else{ 
            tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtHead(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }
            else{
                temp.next = head;
            }
            head = temp;
            size++;
        }
        void insertAt(int idx, int data){
            Node temp = new Node(data);
            Node temp1 = head;
            if(idx == size){
                insertAtEnd(data);
                return;
            }
            else if(idx == 0){
                insertAtHead(data) ;
                return;
            }
            else if(idx < 0 || idx > size){
                System.out.println("wrong index");
                return;
            }
            else{
                for(int i=1;i<=(idx-1);i++){
                    temp1 = temp1.next;
                }
                temp.next = temp1.next;
                temp1.next = temp;
                size++;
            }
        }
        int getAt(int idx){
            if(idx < 0 || idx > size){
                System.out.println("wrong index");
                return -1 ;
            }
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return (temp.data);
        }
        void deleteAt(int idx){
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            if(idx == size)
            Node temp = head;
            for(int i=1;i<=idx-1 ;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
       /* int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count; 

        }*/
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println( );
        ll.insertAtHead(3);
        ll.insertAtHead(7);
        ll.insertAtEnd(12);
        ll.insertAt(2,11);
        ll.insertAt(0, 9);
        ll.display();
        System.out.println();
        System.out.println(ll.size);
       // System.out.println(ll.getAt(3));
        ll.deleteAt(4);
        ll.display();
        System.out.println(ll.tail.data);
    }
}

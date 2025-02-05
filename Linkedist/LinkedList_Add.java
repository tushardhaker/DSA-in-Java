package LinkedList;
public class LinkedList_Add {
     public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     public static Node head;
     public static Node tail;
     

     public void addFirst(int data){
        // step 1 = create a node first
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 - new node next = head
        newNode.next = head;//link

        // step 3 - head = newNode
        head = newNode;
    }
     public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
     public void print(){
        Node temp = head;
        if(temp == null){
            System.out.println("LinkedList is Empty ");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add_mid(int index, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        // i=index-1 , temp = previous
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        LinkedList_Add ll = new LinkedList_Add();
        
        ll.addFirst(1);
        
        ll.addFirst(2);
    
        ll.addLast(3);
        
        ll.addLast(4);

        ll.add_mid(2, 9);
        ll.print();
        
        // System.out.println("Stored Elements are : "+ll);
    }
}

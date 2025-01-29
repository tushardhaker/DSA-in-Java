package Linkedist;
public class LinkedList_Reverse {
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
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next; 
        // 3 variable and 4 equactions.........
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        LinkedList_Reverse ll = new LinkedList_Reverse();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print(); // 6-5-4-3-2-null

        ll.reverse();
        ll.print(); // 2-3-4-5-6-null
    }
}

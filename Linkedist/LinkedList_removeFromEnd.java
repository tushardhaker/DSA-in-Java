package Linkedist;
public class LinkedList_removeFromEnd {
   
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
       public void removefromEnd(int n) {
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        // size-n
        int i = 1;
        Node prev = head;
        while(i<(size-n)){
          prev=prev.next;
          i++;
        }
        prev.next=prev.next.next;
        return;
       }
       public static void main(String[] args) {
        LinkedList_removeFromEnd ll = new LinkedList_removeFromEnd();
           
           ll.addFirst(1);
           
           ll.addFirst(2);
       
           ll.addLast(3);
           
           ll.addLast(4);
   
           ll.add_mid(2, 9);
           ll.print();
           ll.removefromEnd(3);
           ll.print();
           
           // System.out.println("Stored Elements are : "+ll);
       }
   }
   


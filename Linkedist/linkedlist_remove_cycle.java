package Linkedist;

public class linkedlist_remove_cycle {
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

    public static boolean iscycle(){
        Node slow = head;
        Node fast = head;
    
        while(fast!=null && fast.next!=null){
            slow = slow.next ;//+1
            fast = fast.next.next ;//+2
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
              cycle = true;
              break;
            }

            }
            if(cycle==false){
                return ;
            }
        
        // find meeting point
         slow = head;
         Node prev = null;
         while(slow!=fast){
            prev = fast;
            slow=slow.next;
            fast=fast.next;
         }

        // remove cycle
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next= new Node(2);
        Node temp = new Node(7);
        head.next.next = temp;
       
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        
       System.out.println(iscycle());
      removeCycle();
       System.out.println(iscycle());

    }
}

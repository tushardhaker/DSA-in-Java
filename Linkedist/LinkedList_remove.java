
package Linkedist;
public class LinkedList_remove {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
        Node NewNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = NewNode;
            return;

        }
        NewNode.next = head;
        head = NewNode;
    }

    public void addLast(int data) {
        Node NewNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = NewNode;
            return;
        }
        tail.next = NewNode;
        tail = NewNode;
    }

    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add_mid(int index, int data){
        Node NewNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        NewNode.next = temp.next;
        temp.next = NewNode;
    }

    public int removeFirst(){
        size--;
        if(size == 0){
            System.out.println("LL is empty");
        
        }else if(size == 1){
            int value = head.data;
            head = tail = null;
            return value;
        }
        int value = head.data;
        head = head.next;
        return value;
    }
    public int removelast(){
      Node Prev = head;
      for(int i = 0; i<size-2; i++){
        Prev = Prev.next;
      }
      int val = Prev.next.data;
      Prev.next=null;
      tail=Prev;
      size--;
      return val;
    }
    public static void main(String[] args) {
        LinkedList_remove ll = new LinkedList_remove();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add_mid(2, 3);
      
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.removelast();
        ll.print();
        System.out.println(ll.size);
    }
}


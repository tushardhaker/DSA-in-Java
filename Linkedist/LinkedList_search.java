
package Linkedist;
public class LinkedList_search{
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
    public void add(int data) {
        Node NewNode = new Node(data);
        size++;
        NewNode.next = head;
        head = NewNode;
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
    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
        if(temp.data==key){
          
            return i;
        
        }
        temp = temp.next;
        i++;
    } 
       return -1;
    
}
public int helper(Node head,int key){
    if (head==null){
        return-1;
    }
    if(head.data==key){
        return 0;
    }
    int index = helper(head.next, key);
    if(index==-1){
        return -1;
    }
    else{
        return index+1;
    }
}
public int recu_Search(int key){
return helper(head,key);
}
    public static void main(String[] args) {
        LinkedList_search ll = new LinkedList_search();
        int key = 4;
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        // System.out.println(ll.search(key));
System.out.println("Index of key is : "+ll.recu_Search(3)); 
System.out.println("Index of key is : "+ll.recu_Search(7));
    }
}


package Linkedist;
import java.util.LinkedList;

public class LinkedList_merger_sort {

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

    private Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getmid(head);
        // left & right merge
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        // merge
        return merge(newleft, newright);
    }

    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head.next;
                temp = temp.next;
            }
        }
        while (head != null) {
            temp.next = head1;
            head1 = head.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
public static void main(String[] args) {
    LinkedList ll = new LinkedList();
ll.addFirst(1);
ll.addFirst(2);
ll.addFirst(3);
ll.addFirst(4);
ll.addFirst(5);
   
    System.out.println(ll);

    ll.mergesort(head); 
    System.out.println(ll);
}
}

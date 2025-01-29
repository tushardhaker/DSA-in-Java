package Stack;
import java.util.*;

public class Stackoperation {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Empty Operation
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push operation
        public static void push(int data) {
            list.add(data);
        }

        // Pop Operation
        public static int pop() {
            if (isEmpty()) {
                return -1;// Handle underflow
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1); // Correctly remove the last element
            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
               return -1; // Handle underflow
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);

        // Print the elements and pop them from the stack
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop(); // Remove the top element
        }
    }
}

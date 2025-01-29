package Stack;
public class Stack_array {
    static class stack {
        public static int Max_Size = 100;
        public static int top;
        public static int[] arr;

        // public int top;
        // public int []arr;
        public stack() {
            arr = new int[Max_Size];
             top = -1;

        }

        public static boolean isEmpty() {
            return top == -1; // initially stack is empty..
        }

        public static boolean isFull() {
            return top == Max_Size - 1; // stack is full...
        }

        public static void push(int data) {
            if (isFull()) {
                System.out.println("Stack is overflow");
                return;
            }
            arr[++top] = data;
            System.out.println(data + " Pushed to the Stack");
           
        }
       

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is underflow");
                return -1;
            }
            return arr[top--];

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is underflow");
                return -1;
            }
            return arr[top];

        }
    }
    

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(50);
        s.push(30);

        System.out.println(s.pop() + " popped from the stack");
        System.out.println(s.peek() + " is now Top element");

    }
}

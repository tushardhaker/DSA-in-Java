package Queue;
public class Queue_Array_circular {
    public static class Queue {
        public static int arr[];
        public static int size;
        public static int rear;
        public static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            // add first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(3);
        q.add(6);
        q.add(9);
        System.out.println(q.remove());
        q.add(12);
        System.out.println(q.remove());
        q.add(15);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

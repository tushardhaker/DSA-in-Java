package Stack;
import java.util.Stack;

public class Stack_pushATBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
                                                                                                                                                
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        pushAtBottom(s, 100);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}

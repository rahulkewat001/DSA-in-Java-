import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltEx {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();  Stack is a class
        // stack.push(10);
        // stack.push(34);
        // stack.push(56);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


        // Queue<Integer> queue = new LinkedList<>();  // queue is an interface
        // queue.add(3);
        // queue.add(5);
        // queue.add(7);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(56);
        deque.addLast(78);
        deque.removeFirst();
        // etc etc.
    }
}
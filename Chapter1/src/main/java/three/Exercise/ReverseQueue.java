package three.Exercise;

import three.FIFOQueue;
import three.PushDownStack;

//exercise 1.3.6 reverse the queue
public class ReverseQueue {
    public static void main(String[] args) {
        FIFOQueue<String> q = new FIFOQueue<>();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");

        PushDownStack<String> stack = new PushDownStack<>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}


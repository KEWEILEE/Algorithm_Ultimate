package three.Exercise;

import org.junit.Test;

import java.util.Queue;

/**
 * exercise 1.3.14
 */

public class ResizingArrayQueueOfStrings {

    String[] queue = new String[2];
    int First = 0;
    int Last = 0;
    int N = 0;

    public void enqueue(String s) {
        if (queue.length == N) {
            queue = resize(queue, 2 * queue.length);
        }

        if (N == 0) {
            queue[Last] = s;
        } else {
            Last = ++Last % queue.length;
            queue[Last] = s;
        }
        N++;
    }

    public String dequeue() {
        if (queue.length == 2 * N) {
            queue = resize(queue, queue.length / 2);
        }
        String result = queue[First++];
        First = First % queue.length;
        N--;
//        if (queue.length == 2 * N) {
//            queue = resize(queue, queue.length / 2);
//        }
        return result;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public String[] resize(String[] s, int size) {
        String[] newStrings = new String[size];
        for (int i = 0; i < N; i++) {
            newStrings[i] = s[(First+i)%s.length];
        }
        First = 0;
        Last = N-1;
        return newStrings;
    }

    public static void main(String[] args) {
        ResizingArrayQueueOfStrings resizingArrayQueueOfStrings = new ResizingArrayQueueOfStrings();
//        for (int i = 0; i < 10; i++) {
//            resizingArrayQueueOfStrings.enqueue("" + i);
//            System.out.println(resizingArrayQueueOfStrings.queue.length);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(resizingArrayQueueOfStrings.dequeue());
//            System.out.println(resizingArrayQueueOfStrings.queue.length);
//        }
        resizingArrayQueueOfStrings.enqueue("0");
        resizingArrayQueueOfStrings.enqueue("1");
        resizingArrayQueueOfStrings.enqueue("2");
        resizingArrayQueueOfStrings.dequeue();
        resizingArrayQueueOfStrings.dequeue();
        resizingArrayQueueOfStrings.enqueue("3");
        resizingArrayQueueOfStrings.enqueue("4");
        resizingArrayQueueOfStrings.enqueue("5");
    }
}

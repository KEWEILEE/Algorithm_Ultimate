package three;

import org.junit.Test;

public class FIFOQueue<T> {
    private Node first;
    private Node last;
    private int N;

    public void enqueue(T item) {
        Node<T> node = new Node<T>();
        node.item = item;
        if (N == 0) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        N++;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public T dequeue(){
        T item = (T) first.item;
        first = first.next;
        N--;
        if (isEmpty()){
            last = null;
        }
        return item;
    }

    @Test
    public void test() {
        FIFOQueue<String> fifoQueue = new FIFOQueue<String>();
        fifoQueue.enqueue("first");
        fifoQueue.enqueue("second");
        fifoQueue.enqueue("third");

        System.out.println(fifoQueue.dequeue());
        System.out.println(fifoQueue.dequeue());
        System.out.println(fifoQueue.dequeue());

        System.out.println("fin");

    }
}

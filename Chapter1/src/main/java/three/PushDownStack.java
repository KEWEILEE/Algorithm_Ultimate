package three;

import org.junit.Test;

import java.util.Iterator;

public class PushDownStack<T> implements Iterable {

    public Node First; //The first reference
    public int N; //total Number

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return N > 0;
    }

    public void push(T t) {
        Node node = new Node();
        node.item = t;
        node.next = First;
        First = node;
        N++;
    }

    public T pop() {
        N--;
        T t = First.item;
        First = First.next;
        return t;
    }

    public Iterator iterator() {
        return null;
    }

    @Test
    public void Test() {
        PushDownStack<String> pushDownStack = new PushDownStack<String>();
        pushDownStack.push("first");
        pushDownStack.push("second");
        pushDownStack.push("third");

        System.out.println(pushDownStack.pop());
        System.out.println(pushDownStack.pop());
        System.out.println(pushDownStack.pop());
    }
}

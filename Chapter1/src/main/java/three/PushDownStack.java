package three;

import org.junit.Test;

import java.util.Iterator;

public class PushDownStack<T> implements Iterable {

    public Node First; //The first reference
    public int N; //total Number

    public boolean isEmpty() {
        return N == 0;
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
        T t = (T) First.item;
        First = First.next;
        return t;
    }

    public T peek() {
        return (T) First.item;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node node = First;
            @Override
            public boolean hasNext() {
                return First != null;
            }

            @Override
            public T next() {
                T out = (T) First.item;
                First = First.next;
                return out;
            }
        };
    }

    @Test
    public void Test() {
        PushDownStack<String> pushDownStack = new PushDownStack<String>();
        pushDownStack.push("first");
        pushDownStack.push("second");
        pushDownStack.push("third");

//        System.out.println(pushDownStack.pop());
//        System.out.println(pushDownStack.pop());
//        System.out.println(pushDownStack.pop());

        for (Object s : pushDownStack){
            System.out.println(s);
        }
    }
}

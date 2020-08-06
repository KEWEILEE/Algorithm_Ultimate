package three;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Iterable<T> {
    private Node first;

    public void add(T item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
    }

    @Test
    public void test() {
        Bag<String> bag = new Bag<>();
        bag.add("1");
        bag.add("2");
        System.out.println("fin");
        for (String s : bag) {
            System.out.println(s);
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        Node<T> current;

        public ListIterator() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }
            T out = current.item;
            current = current.next;
            return out;
        }
    }
}

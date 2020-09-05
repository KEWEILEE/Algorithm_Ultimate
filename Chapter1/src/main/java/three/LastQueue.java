package three;

/**
 * Write a Queue implementation that uses a circular linked list, which is the same
 * as a linked list except that no links are null and the value of last.next is first whenever
 * the list is not empty. Keep only one Node instance variable (last).
 * @param <T>
 */
public class LastQueue<T> {
    private Node<T> last;

    public void enqueue(T item) {
        //empty list
        Node<T> node = new Node<>();
        node.item = item;

        if (last == null) {
            last = node;
        } else {
            node.next = last.next; // ref to first;
        }

        last.next = node;
        last = node;
    }

    public T dequeue() {
        // null
        if (last == null){
            return null;
        }

        if (last.next == last){
            return last.item;
        }
        Node <T> first = last.next;
        last.next = first.next;
        return first.item;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public static void main(String[] args) {
        LastQueue<String> queue = new LastQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}

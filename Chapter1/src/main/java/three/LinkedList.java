package three;

public class LinkedList<T> {

    private Node<T> First;

    public void add(T t) {
        Node<T> newNode = new Node<>();
        newNode.item = t;

        if (First == null) {
            First = newNode;
        } else {
            Node<T> current = First;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean isEmpty() {
        return First == null;
    }

    public T removeLast() {
        if (First == null) {
            return null;
        }

        //init
        Node<T> previous = null;
        Node<T> current = First;

        //loop
        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        if (previous == null) { //只有一个元素的情况下
            T res = First.item;
            First = null;
            return res;
        } else {
            previous.next = null;
            return current.item;
        }
    }

    public T deleteKth(int k) {//k从1开始
        if (k < 1) {
            return null;
        }
        Node<T> previous = null;
        Node<T> current = First;

        if (First == null) {
            return null;
        }
        int i = 0;

        while (current.next != null && i < k) {
            previous = current;
            current = current.next;
            i++;
        }

        if (i == (k - 1)) { // 成功找到
            if (previous == null) { //第一个是
                T item = First.item;
                First = First.next;
                return item;
            } else {
                previous.next = current.next;
                return current.item;
            }
        } else { //没找到
            return null;
        }
    }

    public boolean find(T key) {
        Node current = First;
        while (current != null) {
            if (current.item == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Write a method removeAfter() that takes a linked-list Node as argument
     * and removes the node following the given one
     * (and does nothing if the argument or the next field in the argument node is null).
     *
     * @param node
     */
    public void removeAfter(Node node) {
        //empty
        if (First == null || node == null) {
            return;
        }
        //at least one element
        Node<T> previous = null;
        Node<T> current = First;

        while (current != null) {
            if (current.item == node.item) { //find it then break
                break;
            }
            previous = current;
            current = current.next;
        }

        if (previous == null) {//the first one is the one
            First = null;
        } else if (current == null) {//cannot find it
            return;
        } else {
            previous.next = null; // find one
        }
    }

    /**
     * WriteamethodinsertAfter()that takes two linked-list Node arguments and
     * inserts the second after the first on its list
     * (and does nothing if either argument is null).
     */
    public void insertAfter(Node<T> first, Node<T> second) {
        if (first == null || second == null || First == null) {
            return;
        }
        Node<T> current = First; //at least one element
        while (current != null && current.item != first.item) {
            current = current.next;
        }

        if (current == null) { // no
            return;
        } else { //找到了
            second.next = current.next;
            current.next = second;
        }
    }

    /**
     * Write a method remove() that takes a linked list and a string key as arguments
     * and removes all of the nodes in the list that have key as its item field.
     *
     * @param key
     */
    public void remove(T key) {
        Node<T> previous = null;
        Node<T> current = First;

        if (current == null) {
            return;
        }

        while (current != null) {
            if (current.item == key) {
                if (previous == null) { //第一个就是要找的
                    //remove
                    First = current.next;
                } else {
                    previous.next = current.next; //remove
                }
            } else {
                previous = current; //only happens when nothing removed
            }
            current = current.next;
        }
    }

    /**
     * Write a method max() that takes a reference to the first node in a linked list as
     * argument and returns the value of the maximum key in the list. Assume that all keys are
     * positive integers, and return 0 if the list is empty.
     */
    public int max() {
        if (First == null) {
            return 0;
        }

        int max = (Integer) First.item;

        Node<Integer> current = First.next;

        while (current != null) {
            max = (current.item > max) ? current.item : max;
            current = current.next;
        }

        return max;
    }

    public int maxRecursive() {
        return maxRec((Node<Integer>) First);
    }

    private int maxRec(Node<Integer> node) {
        if (node.next == null) {
            return node.item;
        }
        int maxNminus1 = maxRec(node.next);
        return node.item > maxNminus1 ? node.item : maxNminus1;
    }

    public Node<T> reverse(){
        Node<T> reverse = new Node<>();
        Node<T>
    }
}

package three.Exercise;

import three.LinkedList;
import three.Node;

public class Ex_24 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        Node<String> node = new Node();
        node.item = "1";
        list.removeAfter(node); //succeed

        list.add("1");
        list.add("2");
        list.add("3");
        node.item = "2";

        Node<String> after = new Node<>();
        after.item = "9999";
        list.removeAfter(node);
        //25 test
        Node<String> first = new Node<>();
        first.item = "1";
        list.add("2");
        list.insertAfter(first, after);

    }
}

package three.Exercise;

import three.LinkedList;

public class Ex_21 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        System.out.println(linkedList.find("one"));
        System.out.println(linkedList.find("two"));
    }
}

package three;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList<String> list= new LinkedList<>();
    LinkedList<String> list1=new LinkedList<>();
    LinkedList<String> list2=new LinkedList<>();
    LinkedList<Integer> list3=new LinkedList<>();

    @Before
    public void init(){
        list.add("first");

        list1.add("first");
        list1.add("first");

        list2.add("first");
        list2.add("second");
        list2.add("first");

        list3.add(1);
        list3.add(4);
        list3.add(2);
        list3.add(3);
    }

    @Test
    public void remove() {
        list2.remove("second");

    }

    @Test
    public void findMax(){
        System.out.println(list3.max());
        System.out.println(list3.maxRecursive());
    }
}
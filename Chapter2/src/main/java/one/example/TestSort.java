package one.example;

public class TestSort {
    public static void main(String[] args) {
        AbstractSort[] abstractSorts = {new SelectionSort()};

        String[] a = {"3", "5", "1", "10", "3"};

        for (AbstractSort abstractSort : abstractSorts) {
            System.out.println(abstractSort.getClass().getName());
            System.out.println("----------------------------");
            abstractSort.sort(a);
            System.out.println("sorted?" + abstractSort.isSorted(a));
            assert abstractSort.isSorted(a);
            abstractSort.show(a);
            System.out.println("----------------------------");
        }
    }
}

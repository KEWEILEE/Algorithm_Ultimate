package one.example;

import java.util.Arrays;

public abstract class AbstractSort {
    public abstract void sort(Comparable[] comparables);

    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void show(Comparable[] a) {
        Arrays.stream(a).sequential().forEach(System.out::println);
    }

    public boolean isSorted(Comparable [] a){
        for (int i = 1; i < a.length; i++) {
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

}

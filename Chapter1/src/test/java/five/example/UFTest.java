package five.example;

import lombok.Getter;
import lombok.Setter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UFTest {

    List<Pair<Integer, Integer>> lists = new ArrayList<>();
    List<Boolean> results = new ArrayList<>();

    @Before
    public void init(){
        lists.add(new Pair<>(4,3));
        lists.add(new Pair<>(3,8));
        lists.add(new Pair<>(6,5));
        lists.add(new Pair<>(9,4));
        lists.add(new Pair<>(2,1));
        lists.add(new Pair<>(8,9));
        lists.add(new Pair<>(5,0));
        lists.add(new Pair<>(7,2));
        lists.add(new Pair<>(6,1));
        lists.add(new Pair<>(1,0));
        lists.add(new Pair<>(6,7));

        results.add(false);
        results.add(false);
        results.add(false);
        results.add(false);
        results.add(false);
        results.add(true);
        results.add(false);
        results.add(false);
        results.add(false);
        results.add(true);
        results.add(true);
    }

    @Test
    public void test() {
        UF_QuickFind uf_quickFind = new UF_QuickFind(10);
        for (int i = 0; i < lists.size(); i++) {
            assertEquals(results.get(i), uf_quickFind.connected(lists.get(i).left, lists.get(i).right));
            if(!uf_quickFind.connected(lists.get(i).left, lists.get(i).right)){
                uf_quickFind.union(lists.get(i).left, lists.get(i).right);
            }
        }
    }

    @Getter
    @Setter
    public class Pair<K, V> {
        K left;
        V right;

        public Pair(K left, V right) {
            this.left = left;
            this.right = right;
        }
    }
}
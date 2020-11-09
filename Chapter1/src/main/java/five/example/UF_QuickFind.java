package five.example;

public class UF_QuickFind extends UF  {

    public UF_QuickFind(int N) {
        super(N);
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public void union(int p, int q) {
        if (find(p) == find(q)){
            return;
        }else{
            int i1 = id[q];
            int i2 = id[p];
            for (int i = 0; i < id.length; i++) {
                if (id[i] == i1){
                    id[i] = i2;
                }
            }
            count--;
        }
    }
}


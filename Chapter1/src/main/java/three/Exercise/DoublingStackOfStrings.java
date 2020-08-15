package three.Exercise;
//exercise1.3.8
public class DoublingStackOfStrings {
    String[] queue = new String[1];
    int N = 0;

    public void enqueue(String s) {
        if (queue.length == N){
            queue = resize(queue, 2*queue.length);
        }
        queue[N++] = s;
    }

    public String dequeue() {
        if (queue.length == 2*N){
            queue = resize(queue, queue.length/2);
        }
        return queue[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public String[] resize(String[] s, int size) {
        String[] newStrings = new String[size];
        for (int i = 0; i < N; i++) {
            newStrings[i] = s[i];
        }
        return newStrings;
    }

    public static void main(String[] args) {
        DoublingStackOfStrings DoublingStackOfStrings = new DoublingStackOfStrings();
        DoublingStackOfStrings.enqueue("1");
        System.out.println(DoublingStackOfStrings.queue.length);
        DoublingStackOfStrings.enqueue("2");
        System.out.println(DoublingStackOfStrings.queue.length);
        DoublingStackOfStrings.enqueue("3");
        System.out.println(DoublingStackOfStrings.queue.length);
        DoublingStackOfStrings.enqueue("4");
        System.out.println(DoublingStackOfStrings.queue.length);

        for (int i=0; i<4; i++){
            System.out.println(DoublingStackOfStrings.dequeue() + "no." + i);
            System.out.println(DoublingStackOfStrings.queue.length);
        }
        
    }
}

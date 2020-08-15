package four.example;

public class TestStopWatch {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        for (int i=0; i<10000000;i++){
            i++;
        }
        double time = stopWatch.elapsedTime();
        System.out.println("time" + time);
    }
}

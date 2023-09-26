import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
            int i =0;
            while (true) {
                try {
                    queue.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Producer puts " + i);
                i++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();

        //Consumer
        new Thread(() -> {
            while (true) {

                Integer i;
                try {
                    i = queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Consumer takes " + i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}

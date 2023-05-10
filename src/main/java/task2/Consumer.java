package task2;

import java.util.concurrent.SynchronousQueue;

public class Consumer implements Runnable {
    private SynchronousQueue<Integer> queue;

    public Consumer(SynchronousQueue<Integer> q) {
        queue = q;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = queue.take();
                System.out.println("CONSUMER: got value " + value);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("ERROR in Consumer thread");
        }
    }
}



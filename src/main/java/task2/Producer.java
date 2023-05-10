package task2;

import java.util.concurrent.SynchronousQueue;

public class Producer implements Runnable {
    private SynchronousQueue<Integer> queue;
    public Producer(SynchronousQueue<Integer> q) {
        queue = q;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                queue.put(i);
                System.out.println("PRODUCER: Sent value " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("ERROR in Producer thread");
        }
    }
}

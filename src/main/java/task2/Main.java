package task2;

import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();
        Runnable producer = new Producer(queue);
        Runnable consumer = new Consumer(queue);
        (new Thread(producer)).start();
        (new Thread(consumer)).start();
    }
}
package task3;

import java.util.Random;

public class MarkThread extends Thread {
    private final Journal journal;
    private final int WEEKS = 3;

    public MarkThread(Journal journal) {
        this.journal = journal;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < WEEKS; i++) {
                for (var group : journal.groups) {
                    for (var student : group.students) {
                        Random rand = new Random();
                        int mark = rand.nextInt(100) + 1;
                        journal.addMark(student, mark);
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

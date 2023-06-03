package task3;

public class Main {
    public static void main(String[] args) {
        Group ip01 = Group.generateGroup(10, "IP-01");
        Group ip02 = Group.generateGroup(12, "IP-02");
        Group ip03 = Group.generateGroup(10, "IP-03");

        Journal journal = new Journal();

        journal.addGroup(ip01);
        journal.addGroup(ip02);
        journal.addGroup(ip03);

        MarkThread teacher = new MarkThread(journal);
        MarkThread assistant1 = new MarkThread(journal);
        MarkThread assistant2 = new MarkThread(journal);
        MarkThread assistant3 = new MarkThread(journal);

        teacher.start();
        assistant1.start();
        assistant2.start();
        assistant3.start();

        try {
            teacher.join();
            assistant1.join();
            assistant2.join();
            assistant3.join();
        } catch (InterruptedException e) {

        }

        System.out.println(journal);
    }
}
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

        Teacher teacher = new Teacher("A", "A");
        Teacher assistant1 = new Teacher("B", "B");
        Teacher assistant2 = new Teacher("C", "C");
        Teacher assistant3 = new Teacher("D", "D");

        try {
            teacher.addMarks(journal);
            assistant1.addMarks(journal);
            assistant2.addMarks(journal);
            assistant3.addMarks(journal);
        } catch(InterruptedException e) {

        }

        System.out.println(journal);
    }
}
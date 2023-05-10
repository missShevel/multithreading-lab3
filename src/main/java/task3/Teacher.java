package task3;

public class Teacher {
    public final String firstName;
    public final String lastName;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addMarks(Journal journal) throws InterruptedException {
        Thread thread = new MarkThread(journal);
        thread.start();
        thread.join();
    }
}

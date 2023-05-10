package task3;

import java.util.Random;

public class Student {
    public final String firstName;
    public final String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Student generateStudent() {
        var random = new Random();
        String[] names = {"John", "Janny", "Jake", "Jordan"};
        String[] surnames = {"Smith", "Wilson", "Bennet", "Green"};

        return new Student(names[random.nextInt(4)], surnames[random.nextInt(4)]);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Group {
    public String groupName;
    public List<Student> students;

    public Group(String name) {
        this.groupName = name;
        students = new ArrayList<>();
    }

    public void addMember(Student student) {
        students.add(student);
    }

    public static Group generateGroup(int size, String name) {
        Group group = new Group(name);

        for (int i = 0; i < size; i++) {
            group.addMember(Student.generateStudent());
        }

        return group;
    }
}

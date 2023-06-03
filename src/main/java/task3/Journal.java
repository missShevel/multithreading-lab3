package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Journal {
    public final List<Group> groups;
    private final HashMap<Student, ArrayBlockingQueue<Integer>> hashMap = new HashMap<>();
    public Journal() {
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        this.groups.add(group);

        for (var student : group.students) {
            if(this.hashMap.containsKey(student)) continue;
            this.hashMap.put(student, new ArrayBlockingQueue<>(100));
        }
    }

    public void addMark(Student student, int mark) throws InterruptedException {
        hashMap.get(student).put(mark);
    }

    public String toString() {
        String result = "";

        for (var group : groups) {
            result += group.groupName + "\n";

            for (var student : group.students) {
                result += student.getFullName() + ": " + hashMap.get(student).toString() + "\n";
            }

            result += "\n";
        }

        return result;
    }
}

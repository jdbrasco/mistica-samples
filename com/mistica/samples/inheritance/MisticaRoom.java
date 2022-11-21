import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MisticaRoom {

    public String prefect;

    public List<Student> students;

    public MisticaRoom() {
        this.students = new ArrayList<Student>();
    }

    public MisticaRoom(List<Student> studentPresent) {
        this.students = studentPresent;
    }

    public String selectPrefect() {
        Collections.sort(this.students, (Student s1, Student s2) -> (s1.grade > s2.grade) ? -1 : (s1.grade < s2.grade) ? 1 : 0);
        return this.students.get(0).firstName;
    }

}
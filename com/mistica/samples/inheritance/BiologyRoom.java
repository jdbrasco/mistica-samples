import java.util.List;

public class BiologyRoom extends MisticaRoom {
    public int highGrade;
    
    public BiologyRoom() {
        super();

        highGrade = 0;
    }

    public BiologyRoom(List<Student> students) {
        super(students);

        highGrade = students.size();
    }
}
public class MisticaRoom {

    public String prefect;
    public List<Student> students;

    public MisticaRoom(List<Student> studentPresent) {
        this.students = studentPresent;
    }

    public string selectPrefect() {
        return "Student with highest GPA";
    }

}

public class BiologyRoom extends MisticaRoom {

    public BiologyRoom() {

    }
}

public class HistoryRoom extends MisticaRoom {

    public HistoryRoom() {

    }
}

public class CalculusRoom extends MisticaRoom {

    public CalculusRoom() {

    }
}

public class MusicRoom extends MisticaRoom {

    public MusicRoom() {

    }
}
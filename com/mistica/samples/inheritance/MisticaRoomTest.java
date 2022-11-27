import java.util.List;
import java.util.Arrays;

public class MisticaRoomTest {

	public static void main(String[] args) {
		Student ajai = new Student("Ajai", "James", 10);
		Student ponnues = new Student("Ponnues", "James", 20);
		Student ethan = new Student("Ethan", "Mistica", 30);

		List<Student> students = Arrays.asList(ajai, ponnues, ethan);

		MusicRoom music = new MusicRoom(students);

		System.out.println("The music class prefect is: " + music.selectPrefect());

		BiologyRoom bio = new BiologyRoom(students);

		System.out.println("The Biology high grde is: " + bio.highGrade());
	}

}
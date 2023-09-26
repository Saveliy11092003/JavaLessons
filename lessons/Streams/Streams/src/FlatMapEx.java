import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 19, 5, 6.4);
        Student st2 = new Student("Mariya", 'f', 23, 1, 7.8);
        Student st3 = new Student("Nikolay", 'm', 22, 2, 2.3);
        Student st4 = new Student("Kobek", 'm', 20, 4, 9.0);
        Student st5 = new Student("Sasha", 'f', 26, 2, 8.9);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("FIT");

        f1.addStudentOnFaculty(st1);
        f1.addStudentOnFaculty(st2);
        f1.addStudentOnFaculty(st3);
        f2.addStudentOnFaculty(st4);
        f2.addStudentOnFaculty(st5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(element -> element.getStudentListOnFaculty().stream()).forEach(System.out::println);
    }
}

class Faculty{
    String name;
    List<Student> studentListOnFaculty;

    public Faculty(String name){
        this.name = name;
        studentListOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentListOnFaculty() {
        return studentListOnFaculty;
    }

    public void addStudentOnFaculty(Student student){
        studentListOnFaculty.add(student);
    }
}
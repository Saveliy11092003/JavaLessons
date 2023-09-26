import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(3, "Kesha");
        Student st2 = new Student(2, "Stesha");
        Student st3 = new Student(4, "Gosha");
        Student st4 = new Student(1, "Klukva");
        Student st5 = new Student(3, "Sensei");
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(2,st5);
        System.out.println(studentLinkedList);
        studentLinkedList.remove(3);
        System.out.println(studentLinkedList);
    }
}

class Student{
    private int course;
    private String name;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }
}
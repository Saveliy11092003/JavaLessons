import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println(treeSet);
        treeSet.remove(2);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(8));

        TreeSet<Student> treeSet1 = new TreeSet<>();
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Marya", 2);
        Student st3 = new Student("Vova", 1);
        Student st4 = new Student("Gora", 4);
        Student st5 = new Student("Stefan", 1);
        Student st6 = new Student("Kepka", 2);
        treeSet1.add(st1);
        treeSet1.add(st2);
        treeSet1.add(st3);
        treeSet1.add(st4);
        treeSet1.add(st5);
        System.out.println(treeSet1);
        System.out.println(treeSet1.first());
        System.out.println(treeSet1.last());
        System.out.println(treeSet1.headSet(st6));
        System.out.println(treeSet1.tailSet(st6));
        System.out.println(treeSet1.subSet(st6, st4));
        System.out.println(st2.equals(st6));
        System.out.println(st2.hashCode());
        System.out.println(st6.hashCode());
    }
}


class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
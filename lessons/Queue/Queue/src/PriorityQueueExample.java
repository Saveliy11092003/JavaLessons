import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(8);
        priorityQueue.add(90);
        priorityQueue.add(12);
        priorityQueue.add(21);
        priorityQueue.add(54);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());


        PriorityQueue<Student> priorityQueue2 = new PriorityQueue<>();
        System.out.println("-------------");
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Marya", 2);
        Student st3 = new Student("Vova", 1);
        Student st4 = new Student("Gora", 4);
        Student st5 = new Student("Stefan", 1);
        Student st6 = new Student("Kepka", 2);
        priorityQueue2.add(st1);
        priorityQueue2.add(st2);
        priorityQueue2.add(st3);
        priorityQueue2.add(st4);
        priorityQueue2.add(st5);
        priorityQueue2.add(st6);
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
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
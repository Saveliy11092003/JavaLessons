import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 19, 3, 6.4);
        Student st2 = new Student("Mariya", 'f', 23, 1, 7.8);
        Student st3 = new Student("Nikolay", 'm', 22, 2, 2.3);
        Student st4 = new Student("Kobek", 'm', 20, 4, 9.0);
        Student st5 = new Student("Sasha", 'f', 26, 2, 8.9);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        List<Student> students = list.stream().filter(element
                -> element.getAge()>19 && element.getAvgGrade()<8)
                .collect(Collectors.toList());
        System.out.println(students);
        System.out.println("-----------------");
        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);
        myStream.forEach(System.out::println);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int cource;
    private double avgGrade;

    public Student(String name, char sex, int age, int cource, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.cource = cource;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", cource=" + cource +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}

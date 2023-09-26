package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 19, 3, 6.4);
        Student st2 = new Student("Mariya", 'f', 23, 1, 7.8);
        Student st3 = new Student("Nikolay", 'm', 22, 2, 2.3);
        Student st4 = new Student("Kobek", 'm', 20, 4, 9.0);
        Student st5 = new Student("Sasha", 'f', 26, 2, 8.9);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        printStudentsOverGrade(arrayList, 7.1);
        System.out.println("------------------------");
        printStudentsUnderAge(arrayList, 23);
        System.out.println("------------------------");
        printStudentsMixConditions(arrayList, 'f', 27, 6.5);
        System.out.println("------------------------");
        test(arrayList, new StudentCheck() {
            @Override
            public boolean check(Student student) {
                return student.age < 26;
            }
        });
        System.out.println("------------------------");
        test(arrayList, (Student st) -> {return st.age < 26;});
        System.out.println("------------------------");
        test(arrayList, student -> student.age<26);
        System.out.println("------------------------");
        StudentCheck studentCheck = student -> student.age<26;
        test(arrayList,studentCheck);
        System.out.println("------------------------");
        Collections.sort(arrayList, (s1,s2) -> s1.cource-s2.cource);
        System.out.println(arrayList);
    }

    public static void test(ArrayList<Student> arrayList, StudentCheck studentCheck){
        for(Student st:arrayList){
            if(studentCheck.check(st)){
                System.out.println(st);
            }
        }
    }
    public static void printStudentsOverGrade(ArrayList<Student> al, double grade){
        for(Student student:al){
            if(student.avgGrade > grade){
                System.out.println(student);
            }
        }
    }

    public static void printStudentsUnderAge(ArrayList<Student> al, int age){
        for(Student student:al){
            if(student.age < age){
                System.out.println(student);
            }
        }
    }

    public static void printStudentsMixConditions(ArrayList<Student> al, char sex, int age, double grade){
        for(Student student:al){
            if(student.avgGrade > grade && student.age < age && student.sex == sex){
                System.out.println(student);
            }
        }
    }
}

interface StudentCheck{
    boolean check(Student student);
}

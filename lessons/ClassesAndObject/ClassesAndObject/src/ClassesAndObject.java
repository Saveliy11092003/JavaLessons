import java.util.Scanner;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Jack", 20);
        person1.printMyData();
        int years1 = person1.getYearsUntilRetirement();
        System.out.println(years1);

        Person person2 = new Person();
        person2.setNameAndAge("Tom", 32);
        person2.printMyData();
        int years2 = person2.getYearsUntilRetirement();
        System.out.println(years2);

        System.out.println("-------------------------");
        Person person3 = new Person();
        person3.setName("");
        person3.setAge(-9);
        person3.printMyData();
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        while (true) {
            if (name.isEmpty()) {
                System.out.println("Имя не может быть пустым, введите имя");
                Scanner scanner = new Scanner(System.in);
                name = scanner.nextLine();
            } else {
                this.name = name;
                break;
            }
        }
    }

    public void setAge(int age) {
        while (true) {
            if (age < 0) {
                System.out.println("Возвраст не может быть отрицательнм");
                Scanner scanner = new Scanner(System.in);
                age = scanner.nextInt();
            } else {
                this.age = age;
                break;
            }
        }
    }

    void printMyData() {
        System.out.println("My name is " + name + " and my age is " + age + " years old");
    }

    int getYearsUntilRetirement() {
        int year = 65 - age;
        return year;
    }

    public void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

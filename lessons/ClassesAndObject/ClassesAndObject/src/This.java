public class This {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 17);
        Human human2 = new Human("Tom", 90);
        human1.printMyData();
        human2.printMyData();
        Human.secondName = "Bobinsk";
        human1.printMyData();
        human2.printMyData();
        Human.secondName = "Typical";
        human1.printMyData();
        human2.printMyData();
        System.out.println("----------------");
        human1.printCountOfPeople();
        human2.printCountOfPeople();
        System.out.println("Третий создан");
        Human human3 = new Human("Tombldon", 909);
        human1.printCountOfPeople();
        human2.printCountOfPeople();
        human3.printCountOfPeople();
    }
}

class Human {
    private int age;
    private String name;

    public static String secondName = "fkdfaj";
    public static int countOfHuman;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        countOfHuman++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void staticMethod() {
        secondName = "jkdafj";
    }

    public void printMyData() {
        System.out.println(name + " " + age + " " + secondName);
    }

    public void printCountOfPeople() {
        System.out.println("Count of people is " + countOfHuman);
    }
}
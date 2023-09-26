public class ToString {
    public static void main(String[] args) {
        Human human = new Human(54, "Bob");
        System.out.println(human);
    }
}

class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
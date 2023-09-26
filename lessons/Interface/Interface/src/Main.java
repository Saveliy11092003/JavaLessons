public class Main {
    public static void main(String[] args) {
        Person person = new Person("Stony");
        person.showInfo();
        Dog dog = new Dog("3231");
        dog.showInfo();
        System.out.println("-------------------------");
        Info info1 = new Person("ketok");
        Info info2 = new Dog("344");
        outputInfo(person);
        outputInfo(dog);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
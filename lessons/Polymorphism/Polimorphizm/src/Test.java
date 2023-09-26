public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);

        System.out.println("---------");
        Animal animal1 = new Dog();//Upcasting
        Dog dog1 = (Dog) animal1;//Downcasting
        dog1.bark();
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
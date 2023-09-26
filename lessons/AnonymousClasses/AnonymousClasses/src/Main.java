public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Animal animal1 = new Animal(){
            public void eat() {
                System.out.println("Other animal is eating");
            }
        };
        animal1.eat();
        System.out.println("--------------------------");
        AbleToEat ableToEater = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("I able to eat");
            }
        };
        ableToEater.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

interface AbleToEat{
    public void eat();
}
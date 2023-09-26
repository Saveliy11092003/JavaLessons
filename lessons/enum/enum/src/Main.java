public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        switch (animal){
            case CAT :
                System.out.println("It is a cat");
                break;
            case DOG:
                System.out.println("It is a dog");
                break;
            case FROG:
                System.out.println("It is a frog");
                break;
        }
        Season season = Season.SUMMER;
        System.out.println(season instanceof Season);
        System.out.println("------------------");
        Animal animal1 = Animal.FROG;
        System.out.println(animal1);
        System.out.println("------------------");
        Season season1 = Season.AUTUMN;
        System.out.println(season1.getTemperature());
        System.out.println("------------------");
        Animal animal2 = Animal.valueOf("FROG");
        System.out.println(animal2);
        Animal animal3 = Animal.DOG;
        System.out.println(animal3.name());
        System.out.println("------------------");
        Season season2 = Season.SPRING;
        System.out.println(season2.ordinal());
    }
}
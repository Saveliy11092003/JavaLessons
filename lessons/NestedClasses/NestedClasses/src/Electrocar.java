public class Electrocar {
    private int id;
    private static int test;

    public Electrocar(int id) {
        this.id = id;
    }

    //Вложенный нестатический класс
    private class Motor{
        public void start(){
            System.out.println("Motor of " + id + "car is starting");
        }
    }

    //Статический вложенный класс
    public static class Batery{
        public void charge(){
            System.out.println("Batery is charging" + test);
        }
    }

    public void start(){
        Motor motor = new Motor();
        motor.start();
        System.out.println("Car is starting");
        final int x = 1;

        //Вложенные классы в методе
        class SomeClass{
            public void someMethod(){
                System.out.println(id + " " + x);
            }
        }
        SomeClass someObj = new SomeClass();

    }
}

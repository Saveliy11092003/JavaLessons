package static_nested_class;

public class Car {

    String color;
    private int countDoors;
    int a;
    Engine engine;

    private static String window;

    public Car(String color, int countDoors, Engine engine) {
        this.color = color;
        this.countDoors = countDoors;
        this.engine = engine;
    }

    public void methodInCar(){
        System.out.println(Engine.b);
        System.out.println(new Engine(42).horsePower);
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", countDoors=" + countDoors +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        int horsePower;
        static int b;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void methodInEngine(){
            System.out.println(window);
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 4, engine);
        System.out.println(car);
    }
}

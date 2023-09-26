package Inner_Class;

public class Car {

    String color;
    private int countDoors;
    int a;
    Engine engine;

    private static String window;

    public Car(String color, int countDoors, int horsePower) {
        this.color = color;
        this.countDoors = countDoors;
        engine = this.new Engine(horsePower);
    }

    public Car(String color, int countDoors) {
        this.color = color;
        this.countDoors = countDoors;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", countDoors=" + countDoors +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        int horsePower;

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
        Car car = new Car("black", 4, 300);
        System.out.println(car);

        Car car1 = new Car("white", 2);
        Car.Engine engine = car1.new Engine(250);
        car1.setEngine(engine);
        System.out.println(car1);
    }
}
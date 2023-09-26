public class Dog implements Info{
    String id;

    public Dog(String id) {
        this.id = id;
    }
    @Override
    public void showInfo() {
        System.out.println("My id is "+ id);
    }
}

public class Person implements Info{
    String name;

    public Person(String name) {
        this.name = name;
    }
    @Override
    public void showInfo() {
        System.out.println("My name is " + name);
    }

    public void say(){
        System.out.println("i can to say");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1.equals(animal2));
        System.out.println("----------------------");
        String str1 = "hello";
        String str2 = "hello12345".substring(0,5);
        System.out.println(str1.equals(str2));
    }
}

class Animal{
    private int id;
    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return (this.id == otherAnimal.id);
    }
}
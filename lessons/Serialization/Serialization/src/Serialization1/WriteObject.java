package Serialization1;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Bob");
        Person person2 = new Person(2,"Jackike");
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package Serialization2;

import Serialization1.Person;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Bob"), new Person(2,"Jackike"), new Person(3, "Tomskiyli")};

        try(ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){

            oos.writeObject(people);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

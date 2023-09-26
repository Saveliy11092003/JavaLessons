package Serialization2;

import Serialization1.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

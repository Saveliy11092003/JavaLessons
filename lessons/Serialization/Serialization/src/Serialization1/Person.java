package Serialization1;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -2332434934L;
    private int id;
    private String name;
    private int cash;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}

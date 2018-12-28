package cl.cutiko.shared;

import java.io.Serializable;

public class Dog implements Serializable {

    private String name;
    private int legs;

    public Dog() {
    }

    public Dog(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}

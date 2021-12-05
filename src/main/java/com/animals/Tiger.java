package com.animals;

public class Tiger {
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("Tiger age is %d", this.age);
    }
}


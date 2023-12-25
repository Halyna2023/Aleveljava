package ua.olifirenko.hw15;

import java.lang.reflect.Field;


public final class A {
    private String id = "123";
    private String name = "A";

    private A() {
    }

    public static A createAndModify() {
        A instance = new A();
        instance.id = "456";
        instance.name = "Modified A";
        return instance;
    }

    @Override
    public String toString() {
        return "A{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        A modifiedInstance = A.createAndModify();
        System.out.println(modifiedInstance);
    }
}

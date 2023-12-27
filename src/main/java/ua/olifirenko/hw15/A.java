package ua.olifirenko.hw15;

import java.lang.reflect.Field;
//1. Создать экземпляр класса с приватным конструктором и изменить значение
//        переменных:
//public class A {
//    private String id = "123";
//    private String name = "A";
//    private A() {
//    }
//    @Override
//    public String toString() {
//        return "A{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

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


}

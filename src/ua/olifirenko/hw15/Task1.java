package ua.olifirenko.hw1;
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
public class Task1 {
    public class Main {
        public static void main(String[] args) {
            A instance = createInstance();
            System.out.println("Before modification: " + instance);

            // Меняем значение приватных полей
            setPrivateField(instance, "id", "456");
            setPrivateField(instance, "name", "B");

            System.out.println("After modification: " + instance);
        }

        private static A createInstance() {
            A instance = null;
            try {
                // Получаем доступ к приватному конструктору
                java.lang.reflect.Constructor<A> constructor = A.class.getDeclaredConstructor();
                constructor.setAccessible(true);

                // Создаем экземпляр класса
                instance = constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        }

        private static void setPrivateField(Object obj, String fieldName, String newValue) {
            try {
                // Получаем доступ к приватному полю
                Field field = obj.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);

                // Устанавливаем новое значение поля
                field.set(obj, newValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}




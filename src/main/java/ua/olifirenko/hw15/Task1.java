package ua.olifirenko.hw15;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class Task1 {


    public static class Main {
        public static void main(String[] args) throws Exception {
            // Создание экземпляра класса A с помощью рефлексии
            A instance = createInstance(A.class);

            // Изменение значения приватного поля id
            setPrivateField(instance, "id", "456");

            // Изменение значения приватного поля name
            setPrivateField(instance, "name", "B");

            // Вывод измененного экземпляра
            System.out.println(instance);
        }

        // Метод для создания экземпляра класса с приватным конструктором
        private static <T> T createInstance(Class<T> clazz) throws Exception {
            java.lang.reflect.Constructor<T> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        }

        // Метод для установки значения приватного поля
        private static void setPrivateField(Object object, String fieldName, Object value) throws Exception {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);

            // Убедитесь, что поле не является final (не изменяемым)
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

            // Установка нового значения поля
            field.set(object, value);
        }
    }

}

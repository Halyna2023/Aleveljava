package ua.olifirenko.hw9;
//1. Создайте класс с main( ), который выбрасывает объект класса Exception
//        внутри блока try.
//        Передайте конструктору Exception аргумент String.
//        Поймайте исключение внутри блока catch и напечатайте сообщение
//        String из объекта exception.
//        Добавьте блок finally и напечатайте сообщение, чтобы убедится, что вы
//        были там.
public class Task1 {
    private static String message;

    public static void main(String[] args) {
            try {
                // Бросаем исключение с аргументом String
                throwException("This is an exception message");
            } catch (Exception e) {
                // Перехватываем исключение и выводим сообщение
                System.out.println("Caught exception: " + e.getMessage());
            } finally {
                // Блок finally, который выполняется всегда
                System.out.println("Finally block executed");
            }
        }

        // Метод, который бросает исключение
        private static void throwException(String message) throws Exception {
            Task1.message = message;
            // Бросаем исключение с переданным сообщением
            throw new Exception(message);
        }
    }



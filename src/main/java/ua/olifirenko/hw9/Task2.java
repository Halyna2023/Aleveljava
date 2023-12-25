package ua.olifirenko.hw9;
//2.
//        Создайте класс с двумя методами f( ) и g( ).
//        В g( ) выбросите исключение
//        В f( ) вызовите g( ), поймайте его исключение и, в блоке catch, выбросите
//        другое исключение
//        Проверьте ваш код в main( ).


public class Task2 {
    public static void main(String[] args) {
        try {
            // Вызываем метод f(), который внутри себя вызывает g()
            f();
        } catch (CustomException2 ce) {
            // Перехватываем исключение, выброшенное в методе g(),
            // и выбрасываем другое исключение
            System.out.println("Caught CustomException2: " + ce.getMessage());
        }
    }

    // Метод g(), который выбрасывает исключение
    private static void g() throws OriginalException2 {
        throw new OriginalException2("Exception thrown from g()");
    }

    // Метод f(), который вызывает g() и перехватывает его исключение
    private static void f() throws CustomException2 {
        try {
            g();
        } catch (OriginalException2 oe) {
            // Перехватываем исключение, выброшенное в методе g(),
            // и выбрасываем другое исключение
            throw new CustomException2("CustomException2 caught in f()", oe);
        }
    }
}

// Оригинальное исключение
class OriginalException2 extends Exception {
    public OriginalException2(String message) {
        super(message);
    }
}

// Новое исключение, выбрасываемое в блоке catch
class CustomException2 extends Exception {
    public CustomException2(String message, Throwable cause) {
        super(message, cause);
    }
}






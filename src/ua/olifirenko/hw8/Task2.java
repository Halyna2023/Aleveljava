package ua.olifirenko.hw8;
//2.
//        Создать функциональный интерфейс Pow с методом pow(int number, int
//        pow), который принимает 2 параметра:
//        1 - число которое возводится в степень,
//        2 - степень в которую возводится число.
//Реализовать этот интерфейс в методе main через лямбду (без использования
//        сторонних пакетов типа Math).
public class Task2 {

    @FunctionalInterface
    interface Pow {
        int pow(int number, int exponent);
    }

    public class Main {
     int number =4;
     int exponent = 6;
        public static void main(String[] args) {
            // Реализация интерфейса Pow через лямбда-выражение
            Pow powFunction = (number, exponent) -> {
                if (exponent == 0) {
                    return 1;
                }

                int result = number;

                for (int i = 1; i < exponent; i++) {
                    result *= number;
                }

                return result;
            };

            // Пример использования
            int base = 2;
            int exponent = 3;

            int result = powFunction.pow(base, exponent);

            System.out.println(base + " в степени " + exponent + " равно " + result);
        }
    }

}





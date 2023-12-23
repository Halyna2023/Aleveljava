package ua.olifirenko.hw8;
//HW8 Task2
// Создать функциональный интерфейс Pow с методом pow(int number, int
//        pow), который принимает 2 параметра:
//        1 - число которое возводится в степень,
//        2 - степень в которую возводится число.
//
//        Реализовать этот интерфейс в методе main через лямбду (без использования
//        сторонних пакетов типа Math).
public class Task2 {
    @FunctionalInterface
    interface Pow {
        int pow(int number, int exponent);
    }

    public static class Main {
        public static void main(String[] args) {
            // Реализация интерфейса Pow через лямбда-выражение
            Pow powFunction = (number, exponent) -> {
                int result = 1;

                for (int i = 0; i < exponent; i++) {
                    result *= number;
                }

                return result;
            };

            // Пример использования
            int base = 5;
            int power = 6;
            int result = powFunction.pow(base, power);

            System.out.println(base + " в степени " + power + " равно " + result);
        }
    }

}

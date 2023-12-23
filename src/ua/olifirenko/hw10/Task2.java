package ua.olifirenko.hw10;
import java.util.ArrayList;
import java.util.List;
//Task2
//
//        Реализовать утильный класс со статическими методами:
//        • getSum(List<Integer> numbers) - возвращает сумму элементов списка
//        • getOddNumber(List<Integer> numbers) - возвращает новый список нечетных чисел
//        • convertToStringList(List<Integer> numbers) - возвращает новый список строк
//        • doubling(List<String> strings) – возвращает новый список, в котором дублирует
//        каждую строку и конкатенирует ее
//        - input: “2i”
//        - output: “2i2i”
public class Task2 {
    public static class ListUtils {
        // Метод для получения суммы элементов списка
        public static int getSum(List<Integer> numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }

        // Метод для получения нового списка нечетных чисел
        public static List<Integer> getOddNumbers(List<Integer> numbers) {
            List<Integer> oddNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 != 0) {
                    oddNumbers.add(number);
                }
            }
            return oddNumbers;
        }

        // Метод для преобразования списка чисел в список строк
        public static List<String> convertToStringList(List<Integer> numbers) {
            List<String> stringList = new ArrayList<>();
            for (int number : numbers) {
                stringList.add(String.valueOf(number));
            }
            return stringList;
        }

        // Метод для дублирования и конкатенации каждой строки в списке
        public static List<String> doubling(List<String> strings) {
            List<String> doubledStrings = new ArrayList<>();
            for (String str : strings) {
                doubledStrings.add(str + str);
            }
            return doubledStrings;
        }

        // Пример использования
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);

            // Примеры вызова методов
            System.out.println("Sum: " + getSum(numbers));
            System.out.println("Odd Numbers: " + getOddNumbers(numbers));
            System.out.println("String List: " + convertToStringList(numbers));

            List<String> inputStrings = List.of("2i");
            List<String> doubledStrings = doubling(inputStrings);
            System.out.println("Doubled Strings: " + doubledStrings);
        }
    }

}

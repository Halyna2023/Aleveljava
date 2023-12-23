package ua.olifirenko.hw11;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Реализовать метод, принимающий список строк и возвращающий Map, где
//        ключ - строка, значение - количество букв в строке.
//        Пример:
//        [“тут”, “там”, “стол”] -> [ {“тут”, 3}, {“там”, 3}, {“стол”, 4}]
public class Task2 {


    public static class StringLengthMapper {
        public static Map<String, Integer> mapStringLengths(List<String> strings) {
            return strings.stream()
                    .collect(Collectors.toMap(
                            // ключ - строка
                            str -> str,
                            // значение - длина строки
                            str -> str.length()
                    ));
        }

        public static void main(String[] args) {
            List<String> inputStrings = List.of("тут", "там", "стол");

            // Пример использования метода
            Map<String, Integer> result = mapStringLengths(inputStrings);
            System.out.println(result);
        }
    }

}

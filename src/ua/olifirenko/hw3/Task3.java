package ua.olifirenko.hw3;
////3. Подсчитать количество слов в строке
//• Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество
//слов в ней.

public class Task3 {
    public static void main(String[] args) {
        String inputString = "Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество\n" +
                "//слов в ней.";
        String[] words = inputString.split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words in the string: " + wordCount);
    }
}



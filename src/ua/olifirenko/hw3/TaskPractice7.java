package ua.olifirenko.hw3;

//удаление пробелов, подсчёт слов в строке


public class TaskPractice7 {
    public static void main(String[] args) {
        String text = "      public public static void main public";
        System.out.println(text);
        String stringWithoutSpaces = text.replace(" ", "");
        System.out.println(stringWithoutSpaces);

        String trimmedString = text.trim();
        System.out.println(trimmedString.split(" ").length);


    }
}

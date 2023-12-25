package ua.olifirenko.hw3;
//Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)
//Например, задание 2:
//• Считать строку из консоли.
//• Передать в метод, который удалит из нее все пробелы.
//• Передать строку без пробелов в метод, который определит, является ли она палиндромом
//(перевертышем), т.е. одинаково пишется как с начала, так и с конца.
//• Вывести результат в main()


public class Task2 {

    public static void main(String[] args) {

        String inputString = "A man a plan a canal Panama"; // Change this to your input string

        // Remove spaces from the string
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");

        // Convert the string to lowercase for case-insensitive comparison
        stringWithoutSpaces = stringWithoutSpaces.toLowerCase();

        // Check if the modified string is a palindrome
        boolean isPalindrome = isPalindrome(stringWithoutSpaces);
        System.out.println(stringWithoutSpaces);
        if (isPalindrome) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
//        System.out.println(stringWithoutSpaces);
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}





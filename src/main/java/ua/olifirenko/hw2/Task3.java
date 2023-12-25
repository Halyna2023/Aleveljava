package ua.olifirenko.hw2;

////3. Определить является ли число четным или нет и
//// вывести результат в консоль.
public class Task3 {

    public static void main(String[] args) {
        int number = 56;
        determineNumber(number);

    }

    public static void determineNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

    }

}









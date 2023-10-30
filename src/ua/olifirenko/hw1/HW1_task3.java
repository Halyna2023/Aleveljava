package ua.olifirenko.hw1;

public class HW1_task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    //Вывести нечетное число
    //Задача
    //Из двух чисел с разной четностью вывести на экран нечетное число.
    public static class Task2 {

        public static void main(String[] args) {
            int x1 = 10;
            int x2 = 17;
            printOdd(x1, x2);
        }

        public static void printOdd(int y1, int y2) {
            if (y1 % 2 > 0) {
                System.out.println(y1);
            } else {
                System.out.println(y2);
            }
        }
    }
}




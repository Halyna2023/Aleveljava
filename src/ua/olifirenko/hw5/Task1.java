package ua.olifirenko.hw5;
//1. Заполнение двумерного массива значениями индекса (от 1 и до кол-ва элементов в
//        массиве), при этом каждая вторая строка - отрицательными значениями.
//        Например
//        1 2 3
//        -4 -5 -6
//        7 8 9
//        -10 -11 -12
//        *Передать массив в метод, заполнить данный массив
public class Task1 {


    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;
        int[][] array = new int[rows][cols];

        fillArray(array);

        // Выводим заполненный массив
        printArray(array);
    }

    // Метод для заполнения двумерного массива значениями индекса
    // и отрицательными значениями в каждой второй строке
    private static void fillArray(int[][] array) {
        int counter = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i % 2 == 0) ? counter : -counter;
                counter++;
            }
        }
    }

    // Метод для вывода двумерного массива
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}






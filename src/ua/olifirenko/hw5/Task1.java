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
            // Размеры двумерного массива
            int rows = 5;
            int cols = 5;

            // Создаем двумерный массив
            int[][] array = new int[rows][cols];

            // Заполняем массив значениями индекса
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = i * cols + j + 1;
                }
            }

            // Каждая вторая строка заполняется отрицательными значениями
            for (int i = 1; i < rows; i += 2) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = -array[i][j];
                }
            }

            // Выводим результаты
            System.out.println("Двумерный массив:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }




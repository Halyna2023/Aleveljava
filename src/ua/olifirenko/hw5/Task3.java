package ua.olifirenko.hw5;

//3. Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
//        которая поменяет местами столбцы и строки.
//        До После
//        1 2 1 3
//        3 4 2 4
//*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
//        Изначальный массив не должен измениться
public class Task3 {
    public static void main(String[] args) {
        // Создаем двумерный массив NxN
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printMatrix(matrix);

        // Меняем местами строки и столбцы
        swapRowsAndColumns(matrix);
        //rotateArray(matrix);

        // Выводим измененный массив
        System.out.println("\nМассив после замены строк и столбцов:");
        printMatrix(matrix);
    }

    // Метод для вывода двумерного массива
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Метод для замены строк и столбцов1
//    int[][] board = new int[
//    int[0].length][matrix.length];
//
//    private int[][] rotateArray(int[][] array) {
//        int[][] board = new int[array[0].length][array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                board[j][i] = array[i][j];
//            }
//        }
//
//        return board;
//    }

    // Метод для замены строк и столбцов2
        public static void swapRowsAndColumns(int[][] matrix) {
            int n = matrix.length;

            // Проходим по диагонали и меняем местами элементы
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // Меняем строки
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[i][j] = temp;

                    // Меняем столбцы
                    temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }

}



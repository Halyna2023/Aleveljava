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
            int[][] originalArray = {
                    {1, 2, 1, 3},
                    {4, 5, 2, 6},
                    {7, 8, 3, 9},
                    {10, 11, 4, 12}
            };

            // Выводим исходный массив
            System.out.println("Исходный массив:");
            printArray(originalArray);

            int[][] modifiedArray = swapRowsAndColumns(originalArray);

            // Выводим модифицированный массив
            System.out.println("\nМодифицированный массив:");
            printArray(modifiedArray);
        }

        // Метод для создания копии массива и замены строк и столбцов
        private static int[][] swapRowsAndColumns(int[][] array) {
            int rows = array.length;
            int cols = array[0].length;

            // Создаем новый массив с обменом строк и столбцов
            int[][] newArray = new int[cols][rows];
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    newArray[i][j] = array[j][i];
                }
            }

            return newArray;
        }

        // Метод для вывода двумерного массива
        private static void printArray(int[][] array) {
            for (int[] row : array) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }


}



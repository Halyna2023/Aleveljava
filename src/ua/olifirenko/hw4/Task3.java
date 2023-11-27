package ua.olifirenko.hw4;
import java.util.Random;
import java.util.Arrays;

//• Заполнить одномерный массив случайными целочисленными значениями.
//        • Все четные значения заменить на нули. Размер массива - 2000 элементов.
public class Task3 {
//    public static void main(String[] args) {
//        // Размер массива
//        int size = 2000;
//
//        // Создаем массив
//        int[] array = new int[size];
//
//        // Заполняем массив случайными целочисленными значениями
//        Random random = new Random();
//        for (int i = 0; i < size; i++) {
//            array[i] = random.nextInt(100) + 1; // Генерация случайных чисел от 1 до 100
//        }
//
//        // Заменяем все четные значения на нули
//        for (int i = 0; i < size; i++) {
//            if (array[i] % 2 == 0) {
//                array[i] = 0;
//            }
//        }
//
//        // Выводим массив после замены
//        System.out.println("Массив после замены четных значений на нули:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }




        public static void main(String[] args) {
            int[] originalArray = generateRandomArray(2000, 1, 100);

            // Выводим исходный массив
            System.out.println("Исходный массив:");
            printArray(originalArray);

            int[] modifiedArray = replaceEvenValuesWithZero(originalArray.clone());

            // Выводим модифицированный массив
            System.out.println("\nМодифицированный массив:");
            printArray(modifiedArray);

            System.out.println("Исходный массив:");
            printArray(originalArray);
        }

        // Метод для генерации массива случайных целочисленных значений в заданном диапазоне
        private static int[] generateRandomArray(int size, int min, int max) {
            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(max - min + 1) + min;
            }

            return array;
        }

        // Метод для вывода массива
        private static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Метод для замены всех четных значений на ноль
        private static int[] replaceEvenValuesWithZero(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    array[i] = 0;
                }
            }
            return array;
        }
    }



package ua.olifirenko.hw4;
import java.util.Random;



//• Заполнить одномерный массив случайными целочисленными значениями.
//        • Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
//        400 элементов.
//        P.S. значения элементов можно ограничить значениями 1-10 включительно.
public class Task1 {

    public static void main(String[] args) {
        int[] array = generateRandomArray(400, 1, 10);

        // Выводим массив
        System.out.println("Сгенерированный массив:");
        printArray(array);

        double arithmeticMean = calcArithmeticMean(array);
        System.out.println("Среднее арифметическое: " + arithmeticMean);

        double geomMean = calcGeomMean(array);
        System.out.println("Среднее геометрическое: " + geomMean);
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

    // Метод для вычисления среднего арифметического элементов массива
    private static double calcArithmeticMean(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }

    // Метод для вычисления среднего геометрического элементов массива
    private static double calcGeomMean(int[] array) {
        int product = 1;

        for (int value : array) {
            product *= value;
        }

        return Math.pow(product, 1.0 / array.length);
    }



    }



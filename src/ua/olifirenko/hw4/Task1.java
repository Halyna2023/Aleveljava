package ua.olifirenko.hw4;
import java.util.Random;



//• Заполнить одномерный массив случайными целочисленными значениями.
//        • Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
//        400 элементов.
//        P.S. значения элементов можно ограничить значениями 1-10 включительно.
public class Task1 {



        public static void main(String[] args) {
            // Размер массива
            int size = 400;

            // Создаем массив
            int[] array = new int[size];

            // Заполняем массив случайными значениями от 1 до 10
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(10) + 1;
            }

            // Находим среднее арифметическое
            double sum = 0;
            for (int value : array) {
                sum += value;
            }
            double average = sum / size;

            // Находим среднее геометрическое
            double product = 1;
            for (int value : array) {
                product *= value;
            }
            double geometricMean = Math.pow(product, 1.0 / size);

            // Выводим результаты
            System.out.println("Массив:");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println("\nСреднее арифметическое: " + average);
            System.out.println("Среднее геометрическое: " + geometricMean);
        }
    }



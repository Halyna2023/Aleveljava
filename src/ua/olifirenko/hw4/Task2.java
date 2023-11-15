package ua.olifirenko.hw4;
import java.util.Random;
//• Заполнить одномерный массив случайными целочисленными значениями.
//        • Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
public class Task2 {
    public static void main(String[] args) {
        // Размер массива
        int size = 1000;

        // Создаем массив
        int[] array = new int[size];

        // Заполняем массив случайными целочисленными значениями
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1; // Генерация случайных чисел от 1 до 100
        }

        // Подсчет количества простых чисел в массиве
        int primeCount = countPrimes(array);

        // Вывод результата
        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }

    // Функция для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Функция для подсчета количества простых чисел в массиве
    private static int countPrimes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}

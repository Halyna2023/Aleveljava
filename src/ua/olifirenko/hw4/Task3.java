package ua.olifirenko.hw4;
import java.util.Random;
//• Заполнить одномерный массив случайными целочисленными значениями.
//        • Все четные значения заменить на нули. Размер массива - 2000 элементов.
public class Task3 {
    public static void main(String[] args) {
        // Размер массива
        int size = 2000;

        // Создаем массив
        int[] array = new int[size];

        // Заполняем массив случайными целочисленными значениями
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1; // Генерация случайных чисел от 1 до 100
        }

        // Заменяем все четные значения на нули
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }

        // Выводим массив после замены
        System.out.println("Массив после замены четных значений на нули:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

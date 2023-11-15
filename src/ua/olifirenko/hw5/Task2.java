package ua.olifirenko.hw5;

import java.util.Arrays;

//2. Проверить заданный массив на упорядоченность по убыванию.
//        *передать массив в метод, получить boolean
public class Task2 {

        public static void main(String[] args) {
            // Пример массива
            int[] array = {10, 8, 5, 3, 2, 1};

            // Проверяем упорядоченность массива по убыванию
            boolean isDescending = isOrderedDescending(array);

            // Выводим результат
            if (isDescending) {
                System.out.println("Массив упорядочен по убыванию.");
            } else {
                System.out.println("Массив не упорядочен по убыванию.");
            }


            // Выводим результат

            System.out.println("Отсортированный массив: " + Arrays.toString(array));
        }

        // Метод для проверки упорядоченности массива по убыванию
        private static boolean isOrderedDescending(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] < arr[i]) {
                    return false;
                }
            }
            return true;
        }


    }



package ua.olifirenko.hw10.Lesson5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(("Min element index: " + findMinElementIndex(numbers)));
        System.out.println(Arrays.toString(numbers));
        System.out.println("Center element: " + findCentrelElement(numbers));

    }

    public static int findCentrelElement(int[] array) {
        int center = array.length / 2;
        if (array.length % 2 == 0) {
            center--;
        }
        return array[center];
    }

    public static int findMinElementIndex(int[] numbers) {
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[minIndex] > numbers[i]) {
                minIndex = 1;
            }
        }
        return minIndex;
    }
   public static void fillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i]= ThreadLocalRandom.current().nextInt(1);
       }
   }

}

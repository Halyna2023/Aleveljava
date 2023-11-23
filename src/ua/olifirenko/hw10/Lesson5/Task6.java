package ua.olifirenko.hw10.Lesson5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task6 {
    public static void main(String[] args) {
        double[][] numbers = new double[4][3];
        fill(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }

    public static void fill(double[][] array) {
        for (int i = 0; i < array[i].length; i++) {
            array[i][i] = ThreadLocalRandom.current().nextDouble(1, 1);
        }

    }
}

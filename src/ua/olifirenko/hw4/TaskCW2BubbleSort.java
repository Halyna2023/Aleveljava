package ua.olifirenko.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

//Switch
public class TaskCW2BubbleSort {
    public static void main(String[] args){
        boolean[] array = new boolean[10];
        fillArray(array);
        System.out.println(array);
        System.out.println("===============================");
        System.out.println(Arrays.toString(array));
        System.out.println("===============================");
      printArrayWithDoWile(array);

        System.out.println("===============================");
        printArrayWithFor(array);
    }
   public static void fillArray(boolean[] array){
       for (int i = 0; i < array.length; i++){
           array[i] = ThreadLocalRandom.current().nextBoolean();
       }
   }
    public static void printArrayWithFor(boolean[] booleans){
        for (int i = 0; i < booleans.length; i++){
            System.out.println(booleans[i]);
        }
    }
   public static void printArrayWithDoWile(boolean[] booleans){
        if (booleans.length == 0){
            return;
        }
        int i = 0;
        do {
            System.out.println(booleans[i++]);
        }while (i< booleans.length);
   }

    }





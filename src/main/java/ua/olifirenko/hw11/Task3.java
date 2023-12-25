package ua.olifirenko.hw11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

//3. Напишите метод, который добавляет 100000 элементов в ArrayList и
//        LinkedList. Напишите еще один метод, который выбирает из заполненного
//        списка элемент наугад 100000 раз. Замерьте время, которое потрачено на
//        это.
public class Task3 {
    public class ListPerformanceTest {

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Измерение времени добавления элементов в ArrayList
            long arrayListAddTime = measureAddTime(arrayList);
            System.out.println("Время добавления элементов в ArrayList: " + arrayListAddTime + " миллисекунд");

            // Измерение времени добавления элементов в LinkedList
            long linkedListAddTime = measureAddTime(linkedList);
            System.out.println("Время добавления элементов в LinkedList: " + linkedListAddTime + " миллисекунд");

            // Заполнение списков элементами (в данном случае, это уже сделано в measureAddTime методе)

            // Измерение времени выбора элементов наугад из ArrayList
            long arrayListGetRandomTime = measureGetRandomTime(arrayList);
            System.out.println("Время выбора элементов наугад из ArrayList: " + arrayListGetRandomTime + " миллисекунд");

            // Измерение времени выбора элементов наугад из LinkedList
            long linkedListGetRandomTime = measureGetRandomTime(linkedList);
            System.out.println("Время выбора элементов наугад из LinkedList: " + linkedListGetRandomTime + " миллисекунд");
        }

        private static long measureAddTime(java.util.List<Integer> list) {
            long startTime = System.currentTimeMillis();

            for (int i = 0; i < 100000; i++) {
                list.add(i);
            }

            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        private static long measureGetRandomTime(java.util.List<Integer> list) {
            Random random = new Random();
            long startTime = System.currentTimeMillis();

            for (int i = 0; i < 100000; i++) {
                int randomIndex = random.nextInt(list.size());
                list.get(randomIndex);
            }

            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }
    }
}

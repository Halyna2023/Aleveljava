package ua.olifirenko.hw10;

import java.util.ArrayList;
import java.util.Iterator;
//Напишите Java-программу для обхода ArrayList с использованием:
//        • цикла for,
//        • for-each,
//        • while,
//        • итератора.
public class Task1 {
    public static class ArrayListTraversalExample {
        public static void main(String[] args) {
            // Создаем ArrayList и добавляем элементы
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Item 1");
            arrayList.add("Item 2");
            arrayList.add("Item 3");

            // 1. Цикл for
            System.out.println("1. Цикл for:");
            for (int i = 0; i < arrayList.size(); i++) System.out.println(arrayList.get(i));

            System.out.println();

            // 2. Цикл for-each
            System.out.println("2. Цикл for-each:");
            for (String item : arrayList) {
                System.out.println(item);
            }

            System.out.println();

            // 3. Цикл while
            System.out.println("3. Цикл while:");
            int index = 0;
            while (index < arrayList.size()) {
                System.out.println(arrayList.get(index));
                index++;
            }

            System.out.println();

            // 4. Итератор
            System.out.println("4. Итератор:");
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

}
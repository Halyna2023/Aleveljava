package ua.olifirenko.hw1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Реализовать программу которая считывает текст с консоли и строит CSV файл. java
//        ● Если пользователь ввел next то происходит переход строки
//        ● Если пользователь вводит end то программа завершается
//        Пример ввода:
//        hi there
//        world
//        next
//        hello
//        next
//        jesus
//        end
//        Пример результата:
//        hi there, world,
//        hello,
//        jesus
public class Task1 {
    public class TextToCSVConverter {
        public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("output.csv")) {
                Scanner scanner = new Scanner(System.in);
                StringBuilder line = new StringBuilder();

                while (true) {
                    System.out.println("Введите текст (или 'next' для перехода на новую строку, 'end' для завершения):");
                    String input = scanner.nextLine();

                    if (input.equals("end")) {
                        break;
                    } else if (input.equals("next")) {
                        writer.write(line.toString() + System.lineSeparator());
                        line.setLength(0); // очищаем строку
                    } else {
                        if (line.length() > 0) {
                            line.append(", ");
                        }
                        line.append(input);
                    }
                }

                // Записываем последнюю строку, если она не пуста
                if (line.length() > 0) {
                    writer.write(line.toString());
                }

                System.out.println("Программа завершена. Результат записан в output.csv.");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}




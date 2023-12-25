package ua.olifirenko.hw12;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleToCSV {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите текст (для новой строки введите 'next', для завершения 'end'): ");
                String input = scanner.nextLine();

                if ("end".equalsIgnoreCase(input)) {
                    break;
                }

                if ("next".equalsIgnoreCase(input)) {
                    lines.add("");  // Пустая строка для перехода на новую строку
                } else {
                    lines.add(input);
                }
            }

            // Запись в CSV файл
            writeCSV("output.csv", lines);

            System.out.println("CSV файл успешно создан (output.csv).");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при создании CSV файла: " + e.getMessage());
        }
    }

    private static void writeCSV(String fileName, List<String> lines) throws IOException {
        try (FileWriter csvWriter = new FileWriter(fileName)) {
            for (String line : lines) {
                csvWriter.append(line);
                csvWriter.append(", ");
            }
        }
    }
}

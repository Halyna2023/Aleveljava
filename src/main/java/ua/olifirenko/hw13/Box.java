package ua.olifirenko.hw13;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;


class Box {
    private String from;
    private String material;
    private String color;
    private LiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    private String deliveryDate;

    Box() {
    }

    public static class LiftingCapacity {
        private String unit;
        private int value;

        public String getUnit() {
            return null;
        }

        public String getValue() {
            return null;
        }

        // геттеры и сеттеры
    }

    public static class Cargo {
        private String name;
        private String cargoClass;

        public String getName() {
            String string = null;
            return null;
        }

        // геттеры и сеттеры
    }

    // геттеры и сеттеры для Box

    // Метод для парсинга JSON и создания экземпляра класса Box
    public static Box fromJson(String json) {
        Gson gson = new Gson();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        return gson.fromJson(jsonObject, Box.class);
    }

    public String getFrom() {
        return from;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public LiftingCapacity getMaxLiftingCapacity() {
        return maxLiftingCapacity;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }
}

class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("box.json")) {
            // Чтение JSON из файла
            StringBuilder content = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            // Парсинг JSON и создание экземпляра класса Box
            Box box = Box.fromJson(content.toString());

            // Вывод информации о Box
            System.out.println("Box Details:");
            System.out.println("From: " + box.getFrom());
            System.out.println("Material: " + box.getMaterial());
            System.out.println("Color: " + box.getColor());
            System.out.println("Max Lifting Capacity: " + box.getMaxLiftingCapacity().getValue() +
                    " " + box.getMaxLiftingCapacity().getUnit());
            System.out.println("Cargo: " + box.getCargo().getName() +
                    " (Class " + box.getCargo().getClass() + ")");
            System.out.println("Delivery Date: " + box.getDeliveryDate());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}


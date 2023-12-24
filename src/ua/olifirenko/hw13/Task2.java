package ua.olifirenko.hw1;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task2{
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("box.json")) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            Box box = new Box();
            box.setFrom(jsonObject.get("from").getAsString());
            box.setMaterial(jsonObject.get("material").getAsString());
            box.setColor(jsonObject.get("color").getAsString());

            JsonObject liftingCapacityObject = jsonObject.getAsJsonObject("max-lifting-capacity");
            MaxLiftingCapacity maxLiftingCapacity = new MaxLiftingCapacity();
            maxLiftingCapacity.setUnit(liftingCapacityObject.get("unit").getAsString());
            maxLiftingCapacity.setValue(liftingCapacityObject.get("value").getAsInt());
            box.setMaxLiftingCapacity(maxLiftingCapacity);

            JsonObject cargoObject = jsonObject.getAsJsonObject("cargo");
            Cargo cargo = new Cargo();
            cargo.setName(cargoObject.get("name").getAsString());
            cargo.setCargoClass(cargoObject.get("class").getAsString());
            box.setCargo(cargo);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            box.setDeliveryDate(dateFormat.parse(jsonObject.get("delivery-date").getAsString()));

            // Теперь у вас есть экземпляр класса Box, созданный из данных JSON файла
            System.out.println("Box details:");
            System.out.println("From: " + box.getFrom());
            System.out.println("Material: " + box.getMaterial());
            System.out.println("Color: " + box.getColor());
            System.out.println("Max Lifting Capacity: " + box.getMaxLiftingCapacity().getValue() +
                    " " + box.getMaxLiftingCapacity().getUnit());
            System.out.println("Cargo Name: " + box.getCargo().getName());
            System.out.println("Cargo Class: " + box.getCargo().getCargoClass());
            System.out.println("Delivery Date: " + box.getDeliveryDate());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





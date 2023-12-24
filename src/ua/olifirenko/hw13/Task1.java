package ua.olifirenko.hw1;
import java.util.Date;
//Прочитать json файл и на его основе построить экземпляр класса Box (класс
//        должен быть создан предварительно)
//        Пример box.json
//        {
//        “from”:”China”,
//        “material”:”steel”,
//        “color”:”black”,
//        “max-lifting-capacity”:{
//        “unit”: “kg”,
//        “value”: 150
//        },
//        “cargo”: {
//        “name” : “electronics”,
//        “class”: “C-1”
//        },
//        “delivery-date” : “2021-09-20T11:07:00”
//        }
public class Task1 {



    public class Box {
        private String from;
        private String material;
        private String color;
        private MaxLiftingCapacity maxLiftingCapacity;
        private Cargo cargo;
        private Date deliveryDate;

        // геттеры и сеттеры
    }

    class MaxLiftingCapacity {
        private String unit;
        private int value;

        // геттеры и сеттеры
    }

    class Cargo {
        private String name;
        private String cargoClass;

        // геттеры и сеттеры
    }


}




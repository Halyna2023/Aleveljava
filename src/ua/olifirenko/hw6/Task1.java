package ua.olifirenko.hw6;
//Класс Phone.
//        а) Создайте класс Phone, который содержит переменные(поля) number,
//        model и weight.
//        б) Добавить конструктор в класс Phone, который принимает на вход
//        три параметра для инициализации переменных класса - number, model
//        и weight.
//        в) Добавить конструктор, который принимает на вход два параметра
//        для инициализации переменных класса - number, model.
//        г) Добавить конструктор без параметров.
//        д) Создайте три экземпляра этого класса.
//        ж) Присвоить значения полям класса.
//        з) Выведите на консоль значения их полей.
//        и) Добавить в класс Phone методы: receiveCall, имеет один параметр
//        – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
//        getNumber – возвращает номер телефона. Вызвать эти методы для
//        каждого из объектов.
//public class Task1 {
////    public static class Phone {
////        int number;
////        int model;
////        double weight;
////        String name = "Alex";
////
////        public Phone(int number, int model, double weight) {    //Конструктор
////            this.number = number;
////            this.model = model;
////            this.weight = weight;
////        }
////        public Phone() {    //Конструктор по умолчанию
////        }
////
////        public void receiveCall() {     //Метод
////            System.out.println("Звонит "+name);
////        }
////        public void getNumber() {     //Метод
////            System.out.println(number);
////        }
////
////        public static void main(String[] args) {
////            Phone Samsung = new Phone();      //Объект
////            Samsung.number = 8112215;
////            Samsung.model = 5;
////            Samsung.weight = 4;
////
////            Phone Nokia = new Phone();         //Объект
////            Nokia.number = 8963210;
////            Nokia.model = 5;
////            Nokia.weight = 2;
////
////            Phone Meizu = new Phone();         //Объект
////            Meizu.number = 8141235;
////            Meizu.model = 3;
////            Meizu.weight = 6;
////
////            Samsung.receiveCall();
////            Nokia.receiveCall();
////            Meizu.receiveCall();
////
////            Samsung.getNumber();
////            Nokia.getNumber();
////            Meizu.getNumber();
////
////            System.out.println("Samsung- number: "+ Samsung.number+" model: "+Samsung.model+" weight: "+Samsung.weight);
////            System.out.println("Nokia- number: "+ Nokia.number+" model: "+Nokia.model+" weight: "+Nokia.weight);
////            System.out.println("Meizu- number: "+ Meizu.number+" model: "+Meizu.model+" weight: "+Meizu.weight);
////        }
////    }
//
//    // Переменные класса
//    private String number;
//    private String model;
//    private double weight;
//
//    // Конструкторы
//    // конструктор с тремя параметрами
//    public Task1(String number, String model, double weight) {
//        this.number = number;
//        this.model = model;
//        this.weight = weight;
//    }
//
//    // конструктор с двумя параметрами
//    public Task1(String number, String model) {
//        this.number = number;
//        this.model = model;
//        // weight по умолчанию равен 0.0
//    }
//
//    // конструктор без параметров
//    public Task1() {
//        // значения по умолчанию
//        this.number = "Неизвестно";
//        this.model = "Неизвестно";
//        this.weight = 0.0;
//    }
//
//    // Методы класса
//    public void receiveCall(String callerName) {
//        System.out.println("Звонит " + callerName);
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public static void main(String[] args) {
//        // Создание трех экземпляров класса Phone
//        Task1 phone1 = new Task1("123456789", "Samsung", 150.5);
//        Task1 phone2 = new Task1("987654321", "iPhone");
//        Task1 phone3 = new Task1();
//
//        // Присвоение значений полям класса
//        phone2.receiveCall("Анна");
//        System.out.println("Номер телефона: " + phone2.getNumber());
//
//        phone1.receiveCall("Петр");
//        System.out.println("Номер телефона: " + phone1.getNumber());
//
//        phone3.receiveCall("Мария");
//        System.out.println("Номер телефона: " + phone3.getNumber());
//    }
//}



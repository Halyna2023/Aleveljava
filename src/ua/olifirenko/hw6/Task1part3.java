package ua.olifirenko.hw6;
//Создайте класс Phone, который содержит переменные(поля) number,
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
//public class Task3 {
//
//        private String number;
//        private String model;
//        private double weight;
//
//        // Конструктор с тремя параметрами
//        public Phone(String number, String model, double weight) {
//            this.number = number;
//            this.model = model;
//            this.weight = weight;
//        }
//
//        // Конструктор с двумя параметрами
//        public Phone(String number, String model) {
//            this.number = number;
//            this.model = model;
//            // По умолчанию присваиваем значение 0.0 для веса
//            this.weight = 0.0;
//        }
//
//        // Конструктор без параметров
//        public Phone() {
//            // По умолчанию присваиваем значения null для номера и модели, 0.0 для веса
//            this.number = null;
//            this.model = null;
//            this.weight = 0.0;
//        }
//
//        // Метод receiveCall
//        public void receiveCall(String callerName) {
//            System.out.println("Звонит " + callerName);
//        }
//
//        // Метод getNumber
//        public String getNumber() {
//            return number;
//        }
//
//        public static void main(String[] args) {
//            // Создаем три экземпляра класса Phone
//            Phone phone1 = new Phone("123-456-789", "Samsung", 150.0);
//            Phone phone2 = new Phone("987-654-321", "iPhone");
//            Phone phone3 = new Phone();
//
//            // Присваиваем значения полям класса
//            phone3.number = "111-222-333";
//            phone3.model = "Nokia";
//            phone3.weight = 120.0;
//
//            // Выводим значения полей объектов
//            System.out.println("Телефон 1: Номер - " + phone1.number + ", Модель - " + phone1.model + ", Вес - " + phone1.weight);
//            System.out.println("Телефон 2: Номер - " + phone2.number + ", Модель - " + phone2.model + ", Вес - " + phone2.weight);
//            System.out.println("Телефон 3: Номер - " + phone3.number + ", Модель - " + phone3.model + ", Вес - " + phone3.weight);
//
//            // Вызываем методы receiveCall и getNumber
//            phone1.receiveCall("Анна");
//            System.out.println("Номер телефона: " + phone1.getNumber());
//
//            phone2.receiveCall("Петр");
//            System.out.println("Номер телефона: " + phone2.getNumber());
//
//            phone3.receiveCall("Мария");
//            System.out.println("Номер телефона: " + phone3.getNumber());
//        }
//    }


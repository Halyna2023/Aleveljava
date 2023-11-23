package ua.olifirenko.hw6;

public class Task1 {
    public static class Phone {
        int number;
        int model;
        double weight;
        String name = "Alex";

        public Phone(int number, int model, double weight) {    //Конструктор
            this.number = number;
            this.model = model;
            this.weight = weight;
        }
        public Phone() {    //Конструктор по умолчанию
        }

        public void receiveCall() {     //Метод
            System.out.println("Звонит "+name);
        }
        public void getNumber() {     //Метод
            System.out.println(number);
        }

        public static void main(String[] args) {
            Phone Samsung = new Phone();      //Объект
            Samsung.number = 812;
            Samsung.model = 1;
            Samsung.weight = 4;

            Phone Nokia = new Phone();         //Объект
            Nokia.number = 813;
            Nokia.model = 2;
            Nokia.weight = 5;

            Phone Meizu = new Phone();         //Объект
            Meizu.number = 814;
            Meizu.model = 3;
            Meizu.weight = 6;

            Samsung.receiveCall();
            Nokia.receiveCall();
            Meizu.receiveCall();

            Samsung.getNumber();
            Nokia.getNumber();
            Meizu.getNumber();

            System.out.println("Samsung: number="+ Samsung.number+" model="+Samsung.model+" weight="+Samsung.weight);
            System.out.println("Nokia: number="+ Nokia.number+" model="+Nokia.model+" weight="+Nokia.weight);
            System.out.println("Meizu: number="+ Meizu.number+" model="+Meizu.model+" weight="+Meizu.weight);
        }
    }
}

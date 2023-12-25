package ua.olifirenko.hw14;

//1. Напишите приложение, которое создает 50 потоков один за одним,
//        каждый из потоков выводит сообщение
//        "Hello from thread (number of thread)", особенность заключается в том, что
//        вывод должен быть строго в обратном порядке, от 49 до 0
public class Task1 {
    public static class ReverseThreadExample {
        public static void main(String[] args) {
            for (int i = 49; i >= 0; i--) {
                final int threadNumber = i;
                Thread thread = new Thread(() -> {
                    System.out.println("Hello from thread " + threadNumber);
                });
                thread.start();
                try {
                    thread.join(); // Ждем завершения потока перед созданием следующего
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




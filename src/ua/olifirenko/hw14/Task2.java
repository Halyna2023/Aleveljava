package ua.olifirenko.hw1;
//2. Напишите приложение, которое в 2 потока будет считать количество
//        простых чисел, которые заданы в массиве, выводить результат и возвращать
//        его в главный поток.
//        Главный поток подсчитывает и выводит общее количество.
import java.util.concurrent.atomic.AtomicInteger;
public class Task2{
    public class PrimeNumberCounter {
        private static final int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        private static final int THREAD_COUNT = 2;

        public static void main(String[] args) {
            AtomicInteger totalPrimes = new AtomicInteger(0);
            Thread[] threads = new Thread[THREAD_COUNT];

            for (int i = 0; i < THREAD_COUNT; i++) {
                final int startIndex = i * (numbers.length / THREAD_COUNT);
                final int endIndex = (i == THREAD_COUNT - 1) ? numbers.length : (i + 1) * (numbers.length / THREAD_COUNT);

                threads[i] = new Thread(() -> {
                    int localCount = 0;
                    for (int j = startIndex; j < endIndex; j++) {
                        if (isPrime(numbers[j])) {
                            localCount++;
                        }
                    }
                    totalPrimes.addAndGet(localCount);
                });

                threads[i].start();
            }

            // Ждем завершения всех потоков
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Total number of prime numbers: " + totalPrimes.get());
        }

        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}





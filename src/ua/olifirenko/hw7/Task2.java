package ua.olifirenko.hw7;
import java.util.Arrays;
import java.util.Random;
//Создайте класс, который описывает вектор (в трёхмерном пространстве).
//        У него должны быть:
//        а) конструктор с параметрами в виде списка координат x, y, z
//        б) метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
//        в) метод, вычисляющий векторное произведение с другим вектором
//        г) метод, вычисляющий косинус угла между векторами: косинус угла между векторами
//        равен скалярному произведению векторов, деленному на произведение модулей (длин)
//        векторов;
//        д) методы для суммы и разности векторов
//        е) статический метод, который принимает целое число N, и возвращает массив случайных
//        векторов размером N.
//        *Если метод возвращает вектор, то он должен возвращать новый объект, а не менять
//        базовый
public class Task2 {



        private double x;
        private double y;
        private double z;

        // Конструктор с параметрами
        public Task2(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Метод для вычисления длины вектора
        public double calculateLength() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        // Метод для вычисления векторного произведения
        public Task2 crossProduct(Task2 other) {
            double newX = y * other.z - z * other.y;
            double newY = z * other.x - x * other.z;
            double newZ = x * other.y - y * other.x;
            return new Task2(newX, newY, newZ);
        }

        // Метод для вычисления косинуса угла между векторами
        public double calculateCosine(Task2 other) {
            double dotProduct = x * other.x + y * other.y + z * other.z;
            double magnitudeProduct = calculateLength() * other.calculateLength();
            return dotProduct / magnitudeProduct;
        }

        // Метод для сложения векторов
        public Task2 add(Task2 other) {
            double newX = x + other.x;
            double newY = y + other.y;
            double newZ = z + other.z;
            return new Task2(newX, newY, newZ);
        }

        // Метод для вычитания векторов
        public Task2 subtract(Task2 other) {
            double newX = x - other.x;
            double newY = y - other.y;
            double newZ = z - other.z;
            return new Task2(newX, newY, newZ);
        }

        // Статический метод для создания массива случайных векторов
        public static Task2[] generateRandomVectors(int N) {
            Task2[] vectors = new Task2[N];
            Random random = new Random();

            for (int i = 0; i < N; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();
                double z = random.nextDouble();
                vectors[i] = new Task2(x, y, z);
            }

            return vectors;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public static void main(String[] args) {
            Task2 vector1 = new Task2(1, 2, 3);
            Task2 vector2 = new Task2(4, 5, 6);

            System.out.println("Vector 1: " + vector1);
            System.out.println("Vector 2: " + vector2);

            System.out.println("Length of Vector 1: " + vector1.calculateLength());
            System.out.println("Length of Vector 2: " + vector2.calculateLength());

            System.out.println("Cross product: " + vector1.crossProduct(vector2));
            System.out.println("Cosine of the angle: " + vector1.calculateCosine(vector2));

            System.out.println("Sum of vectors: " + vector1.add(vector2));
            System.out.println("Difference of vectors: " + vector1.subtract(vector2));

            int N = 3;
            Task2[] randomVectors = Task2.generateRandomVectors(N);
            System.out.println("Random vectors: " + Arrays.toString(randomVectors));
        }
    }



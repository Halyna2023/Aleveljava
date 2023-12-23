package ua.olifirenko.hw7;
import java.util.Arrays;
import java.util.Random;
//Task2
//        Создайте класс, который описывает вектор (в трёхмерном пространстве).
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

    public static class Vektor {
        public static class Vector3D {
            private final double x;
            private final double y;
            private final double z;

            // Конструктор с параметрами
            public Vector3D(double x, double y, double z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }

            // Метод для вычисления длины вектора
            public double calculateLength() {
                return Math.sqrt(x * x + y * y + z * z);
            }

            // Метод для вычисления векторного произведения с другим вектором
            public Vector3D crossProduct(Vector3D other) {
                double resultX = y * other.z - z * other.y;
                double resultY = z * other.x - x * other.z;
                double resultZ = x * other.y - y * other.x;
                return new Vector3D(resultX, resultY, resultZ);
            }

            // Метод для вычисления косинуса угла между векторами
            public double calculateCosineSimilarity(Vector3D other) {
                double dotProduct = x * other.x + y * other.y + z * other.z;
                double magnitudeProduct = calculateLength() * other.calculateLength();
                return dotProduct / magnitudeProduct;
            }

            // Метод для сложения векторов
            public Vector3D add(Vector3D other) {
                return new Vector3D(x + other.x, y + other.y, z + other.z);
            }

            // Метод для вычитания векторов
            public Vector3D subtract(Vector3D other) {
                return new Vector3D(x - other.x, y - other.y, z - other.z);
            }

            // Статический метод для создания массива случайных векторов размером N
            public static Vector3D[] generateRandomVectors(int N) {
                Vector3D[] vectors = new Vector3D[N];
                Random random = new Random();

                for (int i = 0; i < N; i++) {
                    double x = random.nextDouble();
                    double y = random.nextDouble();
                    double z = random.nextDouble();
                    vectors[i] = new Vector3D(x, y, z);
                }

                return vectors;
            }

            // Переопределение метода toString() для удобного вывода вектора
            @Override
            public String toString() {
                return "(" + x + ", " + y + ", " + z + ")";
            }

            // Пример использования
            public static void main(String[] args) {
                Vector3D vector1 = new Vector3D(1, 2, 3);
                Vector3D vector2 = new Vector3D(4, 5, 6);

                System.out.println("Vector 1: " + vector1);
                System.out.println("Vector 2: " + vector2);
                System.out.println("Length of Vector 1: " + vector1.calculateLength());
                System.out.println("Cross Product: " + vector1.crossProduct(vector2));
                System.out.println("Cosine Similarity: " + vector1.calculateCosineSimilarity(vector2));
                System.out.println("Vector Sum: " + vector1.add(vector2));
                System.out.println("Vector Difference: " + vector1.subtract(vector2));

                int N = 5;
                Vector3D[] randomVectors = Vector3D.generateRandomVectors(N);
                System.out.println("Random Vectors: " + Arrays.toString(randomVectors));
            }
        }
    }
}

package ua.olifirenko.hw2;

public class Task2 {
    public static void main(String[] args) {
        // Define the coordinates of the triangle vertices
        double x1 = 1.0;
        double y1 = 5.0;
        double x2 = 3.0;
        double y2 = 5.0;
        double x3 = 6.0;
        double y3 = 7.0;

        // Calculate the side lengths of the triangle
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;

        // Calculate the area using Heron's Formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Output the area to the console
        System.out.println("The area of the triangle is: " + area);
    }
}

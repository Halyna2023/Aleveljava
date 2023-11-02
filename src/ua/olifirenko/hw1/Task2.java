package ua.olifirenko.hw1;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        var c = a;
        a = b;
        b = c;
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}




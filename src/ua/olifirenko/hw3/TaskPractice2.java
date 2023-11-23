package ua.olifirenko.hw3;

//написать программу, для вычисления значения функции y=f(x)
//y=x-2, x>0
//y=0 if x=0
//y=|x|, if x<0
public class TaskPractice2 {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 17;
        printOdd(x1,x2);
    }

    public static void printOdd(int y1, int y2) {
        if (y1 % 2 > 0) {
            System.out.println(y1);
        }
        else {
            System.out.println(y2);
        }
    }
}

package ua.olifirenko.hw3;
//написать программу, для вычисления значения функции y=f(x)
//y=x-2, x>0
//y=0 if x=0
//y=|x|, if x<0
public class TaskPractice1 {
    public static void main(String[] args) {
          int x1 = -2;
          int x2 = 0;
          double x3 = 55.5;
        System.out.println("f(" + x1 + ")=" + calc(x1));
        System.out.println("f(" + x2+ ")=" + calc(x2));
        System.out.println("f(" + x3 + ")=" + calc(x3));

    }
    public static double calc(double x) {
        double y;
        if (x > 0) {
            y = x - 2;
//        } else if (x == 0) {
//            y = 0;
//        } else {
//            y = Math.abs(x);
        } else {
            y = Math.abs(x);
        }

        return y;
    }
}

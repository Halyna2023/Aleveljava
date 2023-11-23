package ua.olifirenko.hw2;

public class TaskCW2 {
    public static void main(String[] args) {
      int x =5;
      int y= 7;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x / (double) y);

        System.out.println("sqrt of 5 = "+ Math.sqrt(5));
        double sqrt =Math.sqrt(7);
        System.out.println("sqrt of 7 = " +sqrt);

        long sqrtRounderd = Math.round(sqrt);
        System.out.println("sqrt rounded = " + sqrtRounderd);
        System.out.println("cos(3) = " + Math.cos(3));
printZero();
int sum = sum(5, y);
      System.out.println(sum);
    }

  public static int sum(int fistNumber, int secondNumber) {
return fistNumber + secondNumber;

  }

  public static void printZero() {
    System.out.println(0);
  }
}

package ua.olifirenko.hw3;

//написать програму для подсчёта sum


public class TaskPractice5 {
    public static void main(String[] args) {
int number = 152_122_456;
int sum =calcSum(number);
        System.out.println(sum);
    }
public static int calcSum(int number){
        int sum =0;
        while (number != 0){
            int remainder = number % 10;
            sum = remainder + sum;
            number/=10;
        }
   return sum;
}
}

package ua.olifirenko.hw3;

//написать програму для подсчёта чётных и не чётных цифр
//2 6 3

public class TaskPractice4 {
    public static void main(String[] args) {

        int number = 5_475_456;
        printEvenAndOddAmount(number);
    }
    public static void printEvenAndOddAmount(int number){
        System.out.println("number: " + number);
        int odd = 0;
        int even = 0;
        while (number !=0){
            int remaind = number % 10;
            if (remaind % 2 == 0){
                even++;
            }else {
                odd++;
            }
            number/=10;
        }

        System.out.println("old: " + odd);
        System.out.println("even: " + even);
    }

}

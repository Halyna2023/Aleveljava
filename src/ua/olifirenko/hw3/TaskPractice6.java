package ua.olifirenko.hw3;

//вщзвести число в степень


public class TaskPractice6 {
    public static void main(String[] args) {
//        int number = 4;
//        int power = 4;
//        System.out.println(power(number, power));
//    }
//public static int power(int number, int power){
//        int result = 1;
//        for (int i = 1; i <= power; i++){
//            result= result+ number;
//        }
//        return result;
//}
                // Возводим число 2 в степень 3 (целочисленно)
                int base = 2;
                int exponent = 3;

                int result = 1;

                for (int i = 0; i < exponent; i++) {
                    result *= base;
                }

                System.out.println(base + " в степени " + exponent + " равно " + result);
            }
        }


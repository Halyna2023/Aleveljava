package ua.olifirenko.hw2;

//4. Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)
public class Task4 {

    public static void main(String[] args) {

        int i = -5;
        int a = 7;
        int b = 11;

//        int i = 5;
//        int a = -7;
//        int b = 1;

        var number1Abs = Math.abs(i);
        var number2Abs = Math.abs(a);
        var number3Abs = Math.abs(b);

        //  if ((Math.abs(i)) < (Math.abs(a)) && (Math.abs(i)) < (Math.abs(b))) {
        if (number1Abs < number2Abs && number1Abs < number3Abs) {
            System.out.println("The number with the smallest modulo is: " + i);  //(Math.abs(i));
            //  } else if ((Math.abs(a)) < (Math.abs(i)) && (Math.abs(a)) < (Math.abs(b))) {
        } else if (number2Abs < number1Abs && number2Abs < number3Abs) {
            System.out.println("The number with the smallest modulo is: " + a); //(Math.abs(a));
        } else {
            System.out.println("The number with the smallest modulo is: " + b);// (Math.abs(b)));
        }
    }
}











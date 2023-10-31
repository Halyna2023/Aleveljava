package ua.olifirenko.hw2;

//4. Вывести на экран меньшее по модулю из трёх вещественных чисел.
//        • Вывести число, не модуль.
//        • Пример -5, 7, 11 = выводим число -5
//        • Пример 5, -7, 1 = выводим число 1
public class task4 {

    public static void main(String[] args) {

//        int i = -5;
//        int a = 7;
//        int b = 11;

        int i = 5;
        int a = -7;
        int b = 1;


        if ((Math.abs(i)) < (Math.abs(a)) && (Math.abs(i)) < (Math.abs(b))) {
            System.out.println("The number with the smallest modulo is: " + i);  //(Math.abs(i));
        } else if ((Math.abs(a)) < (Math.abs(i)) && (Math.abs(a)) < (Math.abs(b))) {
            System.out.println("The number with the smallest modulo is: " + a); //(Math.abs(a));
        } else {
            System.out.println("The number with the smallest modulo is: " + b);// (Math.abs(b)));
        }
    }


}











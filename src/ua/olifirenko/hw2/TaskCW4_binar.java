package ua.olifirenko.hw2;

public class TaskCW4_binar {
    public static void main(String[] args) {
      shiftToRight();
       shiftToRightAlt();
        shiftToLeft();
        shiftToLeftAlt();
    }

    public static void shiftToRightAlt() {
        int number = 67;
        //1000011
        System.out.println(number);
        //0100001
        System.out.println(number >> 1);
        //0010000
        System.out.println(number >> 2);
        //0001000
        System.out.println(number >> 3);
    }
    public static void shiftToRight() {
        int number = 64;
        //1000000
        System.out.println(number);
        //0100000
        System.out.println(number >> 1);
        //0010000
        System.out.println(number >> 2);
        //0001000
        System.out.println(number >> 3);
    }
    public static void shiftToLeft() {
        int number = 8;
        //1000
        System.out.println(number);
        //10000
        System.out.println(number << 1);
        //100000
        System.out.println(number << 2);
        //1000000
        System.out.println(number << 3);
    }
    public static void shiftToLeftAlt() {
        int number = 11;
        //1011
        System.out.println(number);
        //10110
        System.out.println(number << 1);
        //101100
        System.out.println(number << 2);
        //101100
        System.out.println(number << 3);
    }
}

package ua.olifirenko.hw1;
//coment
public class TaskCW2 {

    public static void main(String[] arge){
        //psvm =public static void main()
       //sout = System.out.println();

        byte smallNamber = 35;
        System.out.println(smallNamber);
        short mediumNumber = smallNamber;
        System.out.println(mediumNumber);
        int number = smallNamber;
        System.out.println(number);
        long bigNumber= smallNamber;
        float nonIntegerNumber = smallNamber;
        System.out.println(nonIntegerNumber);
        double bigNonInterNumb = Math.PI;
        System.out.println(bigNonInterNumb);
        char letter = 'a';
        System.out.println(letter);

        byte smallNamber2 = 127;
        System.out.println(smallNamber2);
        int number2 = smallNamber2;
        System.out.println(number2);

        int number3 = 129;
        //-129+2=-127 on around
        System.out.println(number3);
        byte smallNamber3 = (byte) number3;
        System.out.println(smallNamber3);


    }
}

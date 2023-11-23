package ua.olifirenko.hw2;

public class TaskCW1 {
    public static void main(String[] args) {
        //14/2 = 7(0) /2 = 3(1) /2 = 1(1) /2 = 0(1)
        // 1110
        // 1*2^4 +  1*2^2 + 1*2^1 + 0*2^0 = 16+4+2+0 ?????
        int decimal = 14;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        System.out.println(Integer.parseInt(binary, 2));

        binary = convertToBinary(decimal);
        System.out.println(binary);

    }
    public static String convertToBinary( int number){
        String result = "";
        while (number != 0){
            result += number % 2;
            number /= 2;
        }
        return new StringBuilder(result).reverse().toString();
    }
}

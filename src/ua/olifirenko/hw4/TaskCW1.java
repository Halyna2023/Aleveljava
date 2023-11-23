package ua.olifirenko.hw4;

//Switch
public class TaskCW1 {
    private static void calculateAndPrint1(String operation, int firstNumber, int secondNumber) {
//        switch (operation) {
//            case "/":
//                System.out.println((double) firstNumber / secondNumber);
//                break;
//            case "*":
//                System.out.println((double) firstNumber * secondNumber);
//                break;
//            case "+":
//                System.out.println((double) firstNumber + secondNumber);
//                break;
//            default:
//                System.out.println((double) firstNumber - secondNumber);

//     вариант2
//        int value = switch (count) {
//            case 1:
//                break 12;
//            case 2:
//                break 32;
//            case 3:
//                break 52;
//            default:
//                break;

  //      вариант3

        double result = switch (operation){
            case "/" -> (double)firstNumber/secondNumber;
            case "*" -> firstNumber*secondNumber;
            case "+" -> firstNumber+secondNumber;
            default -> firstNumber-secondNumber;
    };
        System.out.println(result);
        //variant 4 java 13
//        int value = switch (count){
//            case 1:
//                yield 12;
//            case 2:
//                yield 32;
//            case 3:
//                yield 52;
//            default:
//                yield 0;
//        };



        };
    }





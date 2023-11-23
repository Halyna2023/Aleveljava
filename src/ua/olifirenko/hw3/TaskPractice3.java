package ua.olifirenko.hw3;

//часто встреч слова в строке
//задача определить как часто

public class TaskPractice3 {
    public static void main(String[] args) {
        String text = "public static void main(String[] args) {";
 int charAmount = calcCharFrequency(text, '[');
        System.out.println(charAmount);
    }
public static int calcCharFrequency(String input, char symbol){
       int amount = 0;
        for (int i = 0; i < input.length(); i++){
          if (input.charAt(i) == symbol){
              amount++;
          }

       }
    return amount;
}
}

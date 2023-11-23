package ua.olifirenko.hw1;
//coment
public class TaskCW4 {

    public static void main(String[] arge){
      char letterA = 'A';
      for (int i=0; i< 26; i++){
          char currentLetter = (char) (letterA + i);
          if (currentLetter == 'C'){
              continue;
          }
          System.out.print(currentLetter);
      }
        System.out.println();
      int i = 0;
      while (i < 26){
          char currentLetter =(char) (letterA + i);
          System.out.print(currentLetter);
          i= i +1;
      }
        System.out.println();
      i=0;
      do {
          char currentLetter =(char) (letterA + i);
          System.out.print(currentLetter);
          i= i +1;
          if (currentLetter == 'M'){
              break;
          }

      }while (i < 26);
    }
}

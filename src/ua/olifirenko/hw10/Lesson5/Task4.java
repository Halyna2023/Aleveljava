package ua.olifirenko.hw10.Lesson5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        String[] liner ={  "public", "static", "void", "main", "Task4"};
        System.out.println(Arrays.toString(liner));
        System.out.println("has duplicates" + hasDuplicatesUsingStream(liner));
    }
    public static boolean hasDuplicatesUsingStream(String[] lines){
        return Arrays.stream(lines).distinct().count() != lines.length;
    }
}

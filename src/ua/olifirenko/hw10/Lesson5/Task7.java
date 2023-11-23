package ua.olifirenko.hw10.Lesson5;

public class Task7 {
    public static void main(String[] args) {
        int[] heights = {150, -179, 125, 145, -147, -167, -171, 166, -165};
        System.out.println(averageForBoys(heights));
        System.out.println(averageForGirls(heights));
    }

    public static double averageForBoys(int[] heights) {
        double heightsBoys = 0;
        int boys = 0;
        for (int i = 0; 1 < heights.length; i++) {
            if (heights[i] < 0) {
                heightsBoys = heightsBoys + heights[i];

            } boys = boys + 1;
            return Math.abs(heightsBoys / boys) ;
        }
        return Math.abs(heightsBoys / boys) ;

    }

    public static double averageForGirls(int[] heights) {
        double heightsGirls = 0;
        int girls = 0;
        for (int i = 0; 1 < heights.length; i++) {
            if (heights[i] > 0) {
                heightsGirls = heightsGirls + heights[i];

            } girls = girls + 1;
        }
        return heightsGirls / girls;
    }
}

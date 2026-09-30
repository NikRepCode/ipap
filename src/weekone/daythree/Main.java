package weekone.daythree;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int[] mas = {11, 77, -12, 55, 18, 39};
        int[] closest = findClosestPair(mas);
        System.out.println(Arrays.toString(closest));
    }

    //найти пару самых близких чисел в массиве целых чисел
    public static int[] findClosestPair(int[] mas) {
        int[] pair = new int[2];
        int minDelta = Integer.MAX_VALUE;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 1 + i; j < mas.length; j++) {
                int delta = abs(mas[i]-mas[j]);
//                System.out.println(mas[i] +"  "+mas[j]+"    "+delta);
                if(delta< minDelta)
                {
                    minDelta=delta;
                    pair[0] = mas[i];
                    pair[1] = mas[j];
                }
//                System.out.println(mas[i] + " " + mas[j]);
            }
        }

        return pair;
    }
}
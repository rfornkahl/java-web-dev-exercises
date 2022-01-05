package exercises.chapter3;

import java.util.Arrays;

public class Array_Practice {
    public static void main(String[] args){

        int[] array = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        String sample = ("I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.");

        String[] sampleArray = (sample.split(" "));

        System.out.println(Arrays.toString(sampleArray));

        String[] sampleArray2 = (sample.split("\\."));
        System.out.println(Arrays.toString(sampleArray2));

    }

}

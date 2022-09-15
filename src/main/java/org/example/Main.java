package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Sorting in public class with static method and three ways to print it
        // (including ArrayUtils and Stream)
        // int Array is initialised inside the method
        int[] someNumbers = Sorting.sortAb(new int[]{5, 56, 7, -5, 0, 123});

        for (int l : someNumbers) {
            System.out.println(l);
        }
        System.out.println(ArrayUtils.toString(someNumbers));
        Arrays.stream(someNumbers).forEach(System.out::println);

        // Searching for Min and Max values in public class with static methods
        // int Array is passed as a method parameter
        FindMinMax.findMin(new int[]{76, 43, 3, -3, 0});
        FindMinMax.findMax(new int[]{76, 43, 3, -3, 0});

        // Searching for the second largest value in the Array
        System.out.println("The second largest value in the Array is:" +
                Sorting.returnSecondLargestValue(new int[]{90,123,-13,0,13,99,6,8}));
        //some test
    }
}
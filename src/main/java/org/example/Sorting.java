package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Iterator;

public class Sorting {


    public static int[] sortAb(int[] someNumbers) {
        int k;
        for (int i = 0; i < someNumbers.length; i++) {
            for (int j = i + 1; j < someNumbers.length; j++) {
                if (someNumbers[j] < someNumbers[i]) {
                    k = someNumbers[i];
                    someNumbers[i] = someNumbers[j];
                    someNumbers[j] = k;
                }
            }
        }
        return someNumbers;
    }

    public static int returnSecondLargestValue(int[] arr){
        int[] sortedAbValues = sortAb(arr);
        return sortedAbValues[sortedAbValues.length-2];
    }
}

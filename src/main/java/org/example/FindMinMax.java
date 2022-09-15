package org.example;

import java.util.Arrays;

public class FindMinMax {

    public static void findMin(int[] arr){
        int k = arr[0];
        for (int i: arr){
            if (i < k){
                k = i;
            }
        }
        System.out.println("The min is: " + k);;
    }


    public static void findMax(int[] arr){
        int k = arr[0];
        for (int i: arr){
            if (i > k){
                k = i;
            }
        }
        System.out.println("The max is: " + k);
    }
}

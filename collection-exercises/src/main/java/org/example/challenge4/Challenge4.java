package org.example.challenge4;

import java.util.*;

/**
 * Create an array of type int with numbers: {1,4,4,2,6,7}. Next, create an appropriate Collection
 * and populate it with the content of the int array. Lastly, print out each element in the
 * Collection without duplicates.
 */

public class Challenge4 {

    public static void main(String[] args) {

        int[] numbers = {1,4,4,2,6,7};

        Set<Integer> integers = new HashSet<>();
        for (int i=0; i<numbers.length ;i++){
            integers.add(numbers[i]);

        }

        System.out.println(integers);

    }
}

package org.example.exercise8;

import java.util.*;

/**
 * Create a new hashSet and populate it with random names. Lastly, sort the names in
 * alphabetical order using only a Set or a child of Set.
 */

public class Exercise8 {
    public static void main(String[] args) {


        HashSet<String> randomName = new HashSet<>();

        randomName.add("Roudabeh");
        randomName.add("Soheil");
        randomName.add("Jonas");
        randomName.add("Mehrdad");
        randomName.add("Simon");
        randomName.add("Erik");

        Set<String> randomNameSorted = new TreeSet<>(randomName);
        System.out.println(randomNameSorted);

    }
}

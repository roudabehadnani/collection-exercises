package org.example.exercise7;


import java.util.*;

/**
 *Create a new hashSet and populate it with random names. Then convert the hashSet to an
 * arrayList. Lastly, manually sort the list in alphabetical order and print it out.
 */

public class Exercise7 {

    public static void main(String[] args) {


        HashSet<String> randomName = new HashSet<>();

        randomName.add("Roudabeh");
        randomName.add("Soheil");
        randomName.add("Jonas");
        randomName.add("Mehrdad");
        randomName.add("Simon");
        randomName.add("Erik");

        List<String> randomNameList = new ArrayList<>(randomName);
        System.out.println(randomNameList);

        for (int i = 0; i < randomNameList.size(); i++) {
            for (int j = i; j > 0 ; j--) {
                if (randomNameList.get(j).charAt(0) < randomNameList.get(j-1).charAt(0)){
                    String temp = randomNameList.get(j);
                    randomNameList.set(j,randomNameList.get(j-1));
                    randomNameList.set(j-1,temp);
                }
            }
        }
        System.out.println(randomNameList);

    }
}

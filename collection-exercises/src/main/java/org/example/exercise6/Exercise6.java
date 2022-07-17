package org.example.exercise6;


import java.util.*;

/**
 * Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
 * an arrayList.
 */

public class Exercise6 {

    public static void main(String[] args) {

        HashSet<String> dayOfWeekSet = new HashSet<>();

        dayOfWeekSet.add("Monday");
        dayOfWeekSet.add("Tuesday");
        dayOfWeekSet.add("Wednesday");
        dayOfWeekSet.add("Thursday");
        dayOfWeekSet.add("Friday");
        dayOfWeekSet.add("Saturday");
        dayOfWeekSet.add("Sunday");

        List<String> dayOfWeekList = new ArrayList<>(dayOfWeekSet);

        System.out.println(dayOfWeekList);








    }
}

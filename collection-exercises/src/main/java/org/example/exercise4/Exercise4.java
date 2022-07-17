package org.example.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a new list and populate it with the days of the week. Then create a new list out of the
 * first three elements of the first list using a subList.
 */

public class Exercise4 {

    public static void main(String[] args) {

        List<String> dayOfWeek = new ArrayList<>();
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");

        List<String> day = dayOfWeek.subList(0,3);
        System.out.println(day);

    }
}

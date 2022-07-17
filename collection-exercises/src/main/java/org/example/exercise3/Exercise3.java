package org.example.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
 * insert the weekday THURSDAY into the right position in the list.
 */

public class Exercise3 {

    public static void main(String[] args) {


        List<String> dayOfWeek = new ArrayList<>();

        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");

        dayOfWeek.add(6,"THURSDAY");

        System.out.println(dayOfWeek);






    }
}

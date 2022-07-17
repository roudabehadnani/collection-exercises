package org.example.challenge1;

import java.util.HashSet;
import java.util.Set;

/**
 * Create an empty set and populate it with the all the days of the week. Next create a second
 * set and populate it with ONLY the weekend days (SATURDAY and SUNDAY). Lastly, compare
 * the two sets and retain in the first set only those days that are the same in both sets.
 */

public class Challenge1 {

    public static void main(String[] args) {

        Set<String> dayOfWeek = new HashSet<>();
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");



        Set<String> weekendDays = new HashSet<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        dayOfWeek.retainAll(weekendDays);
        System.out.println(dayOfWeek);

        }
    }



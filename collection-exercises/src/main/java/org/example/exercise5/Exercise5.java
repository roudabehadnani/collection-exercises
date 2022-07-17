package org.example.exercise5;

import java.util.HashSet;


/**
 * Create a new hashset and populate it with the days of the week. Lastly, print the set out and
 * pay attention to the order of the elements
 */

public class Exercise5 {

    public static void main(String[] args) {


        HashSet<String> dayOfWeek = new HashSet<>();

        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");

        System.out.println("dayOfWeek = " + dayOfWeek);

    }
    
}

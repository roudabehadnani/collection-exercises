package org.example.exercise1;


import java.util.ArrayList;
import java.util.List;

/**
 * Create a new list and populate it with the days of the week. Lastly, print the out the list.
 */

public class Exercise1{

    public static void main(String[] args) {

        List<String> dayOfWeek = new ArrayList<>();
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

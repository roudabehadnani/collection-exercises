package org.example.exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create a new list and populate it with the days of the week. Lastly, iterate through the list
 * and print out each element separately.
 */

public class Exercise2 {

    public static void main(String[] args) {


        List<String> dayOfWeek = new ArrayList<>();
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");


        Iterator<String> iterator = dayOfWeek.iterator();

        while (iterator.hasNext()){

            String day = iterator.next();
            System.out.println(day);
        }

    }
}

package org.example.exercise11;


import java.util.HashMap;

/**
 * Create a new hashMap of type <Integer,String> and populate it with elements containing an 
 * id(Integer) and a car brand(String). Lastly, print out only the values.
 */

public class Exercise11 {

    public static void main(String[] args) {

        HashMap<Integer, String> carId = new HashMap<>();

        carId.put(1, "Volvo");
        carId.put(2,"Toyota");
        carId.put(3,"BMW");
        carId.put(4,"Ford");
        carId.put(5,"Volkswagen");

        System.out.println("carId.values() = " + carId.values());



        
    }
}

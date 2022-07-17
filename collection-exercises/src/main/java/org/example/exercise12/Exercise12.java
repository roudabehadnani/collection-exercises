package org.example.exercise12;


import java.util.Collection;
import java.util.HashMap;


/**
 * Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
 * Create a new hashMap of type <Integer,Car> and populate it with elements containing an
 * id(Integer) and a car object(Car). Lastly, print out only the car's brand.
 */

public class Exercise12 {

    public static void main(String[] args) {

        Car volvo = new Car(123, "Volvo", "MC154");
        Car bmw = new Car(78, "BMW", "BM89");
        Car ford = new Car(501, "Ford", "FW987");



        HashMap<Integer, Car> car = new HashMap<>();

        car.put(volvo.getId(),volvo);
        car.put(bmw.getId(),bmw);
        car.put(ford.getId(),ford);

        Collection<Car> carBrand = car.values();
        for (Car c: carBrand ) {
            System.out.println(c.getBrand());

        }








    }
}

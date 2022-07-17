package org.example.challenge3;


import java.util.*;

/**
 * Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and
 * setters. Have the class implement the Comparable interface. Implement the override method
 * and have it compare the AGE of the superhero. Next, create a new arrayList of type
 * SuperHero. Sort the list by age and print out each element
 */

public class Challenge3 {

    public static void main(String[] args) {


        SuperHero superHero = new SuperHero(1, "IronMan", 76);
        SuperHero superHero1 = new SuperHero(2, "SpiderMan", 40);
        SuperHero superHero2 = new SuperHero(3, "Hulk", 65);
        SuperHero superHero3 = new SuperHero(4, "SuperMan", 60);

        List<SuperHero> heroList = new ArrayList<>();
        heroList.add(superHero);
        heroList.add(superHero1);
        heroList.add(superHero2);
        heroList.add(superHero3);

        Collections.sort(heroList);
        for (SuperHero sortHero: heroList) {
            System.out.println("sortHero.getAge() = " + sortHero.getAge()
            + " sortHero.getName() = " + sortHero.getName() +
                    " sortHero.getId() = " + sortHero.getId());


        }

    }
}

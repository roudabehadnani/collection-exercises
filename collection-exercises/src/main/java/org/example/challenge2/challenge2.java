package org.example.challenge2;


import java.util.HashMap;
import java.util.Set;

/**
 * Create a new hashMap of types <String,String> and populate it with elements containing an
 * email (String) and a name (String). Next, create a new Set and populate it with the keys from
 * the hashMap you created.
 */

public class challenge2 {

    public static void main(String[] args) {

        HashMap<String, String> emailName = new HashMap<>();

        emailName.put("roudabeh.adnani@gmail.com","Roudabeh");
        emailName.put("simon@lexicon.se", "Simon");
        emailName.put("erik@lexicon.se", "Erik");

        Set<String> key = emailName.keySet();
        System.out.println(key);

    }
}

package LearningByRau.Grundlagen;

import java.util.HashMap;

public class LearningHashMap {

    public void hashMap(){
        /*
            HashMap kann wie Array mehrere Elemente halten.
            Element bei HashMap besteht immer aus Key & Value (key-value pair).
         */

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Deutschland", "Berlin"); // .put um Element hinzuzufügen.
        capitalCities.put("Türkei", "Ankara"); //Key(Schlüssel) ist Türkei, value(wert) ist Ankara.
        capitalCities.put("England", "London");
        System.out.println(capitalCities.get("Türkei")); // oder
        String valueGermany = capitalCities.get("Deutschland");
        System.out.println(valueGermany);
        capitalCities.remove("England"); // remove, für einzelnes Element, clear() für alle Elemente

    }

}

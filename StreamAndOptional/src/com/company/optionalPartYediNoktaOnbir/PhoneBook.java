package com.company.optionalPartYediNoktaOnbir;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {
        {
            put("Jos de Vos", "016/161616"); // entryset'te enrty key,value olarak alınır. yani 10.satır bir key,value entrysi diyebiliriz.
            put("An de Toekan", "016/161617");//11.satır da aynı şekilde key,value entrysi diyebiliriz.
            put("Kris de Vis", "016/161618");
        }
    };
//optional ile null check yapmak zorunda kalmıyoruz. Böylece NullPointerException görmemiş oluruz.



    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    PhoneBook() {
    }

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name) {

        return Optional.ofNullable(PHONE_NUMBERS.get(name));
        /*eğer yukarıdaki değer null olursa null değil de optional kullanıldığı için
        * optional'ın değerini kullanır.*/



        /*
            return PHONE_NUMBERS.get(name);
            yukarıdaki  gibi get ile yaptığımız da eğer name alanı yoksa null dönecek.
            ama null dönmesini istemediğimiz için.
         */
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        return PHONE_NUMBERS.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}


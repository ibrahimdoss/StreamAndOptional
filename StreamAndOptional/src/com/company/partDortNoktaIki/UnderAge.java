package com.company.partDortNoktaIki;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {

    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }



    public static Set<String> getKidNames2(List<Person> people) {

        return people.stream()
                .filter(person -> person.getAge() < 18) // Stream<Person>
                .map(Person::getName)                   // Stream<String> => "onur","ali","onur"
                .collect(Collectors.toSet());           // Set<String> => "onur","ali"

    }
}

//set collectionu içerisinde birden fazla aynı değeri taşımazlar, değerler tekildir.,
//yani yukarıda önce filter ile 18'den küçükleri aldık sonra Stream personu map ile transform ettik stream stringe çevirdik.
//ardından collect toSet yaptık set işlemi de yukarıdaki örnekteki gibi aynı değeri taşımaz.
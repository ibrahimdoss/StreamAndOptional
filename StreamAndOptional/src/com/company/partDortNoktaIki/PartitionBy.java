package com.company.partDortNoktaIki;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PartitionBy {

    public static void main(String[] args) {

    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person); //
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults2(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() >=18, Collectors.toList()));
        // people.stream().filter(person.getAge() >= 18).collect(Collectors.toList());
        //29.satırda sadece true listesini alıyoruz ama biz true ve false alabilmemiz için groupingBy kullandık.
    }
}

/*//bir listeyi mape çevirmenin yöntemi gruplamak
List<Integer> : 1,2,3,4,5,6,7,8
çiftleri bir listeye ata, tekleri başka listeye ata gibi bir gruplama yapılabiliyor.
yukarıda da alınan listede gruplama yapılması gerekiyordu yaşın 18'inden büyük olmasına veya olmamasına
        göre iki gruba ayırmak gerekti.*/

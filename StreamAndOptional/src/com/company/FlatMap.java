package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

    }

    /*iki boyutlu iç içe bir nested listemiz var. yani
    {
        {A, B, C}
        {D, E, F}

    }*/

    //Nested List'e ait değerleri al. => stream()
    //her bir elemanı bir listeye ekle => flatMap = nested listeyi flat yapar. yani yukarıdaki örnekte flatMap kullandığımızda
    //liste {A,B,C,D,E,F} şeklinde olacak.
    //public static List<String> transform(List<List<String>> collection) {
       /* List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) { //collectionu alıp bir tane liste elemana atamış subcollectiona yani.
            for (String value : subCollection) { // burada ise bu yeni oluşturduğu subcollectiondaki değeri de listeye eklemiş.
                newCollection.add(value);
            }
        }
        return newCollection;
    }*/
        public static List<String> transform2 (List<List<String>> collection){
            return collection.stream()
                    .flatMap(Collection::stream) //Stream<Stream<String>> -> Stream<String> //ikili streami tek streame düşürmenin yöntemi bu şekilde.
                    .collect(Collectors.toList()); //Stream<String> -> List<String> şeklinde bize dönüşüm sağladı.

        }



}

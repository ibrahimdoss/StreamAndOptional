package com.company;

import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive("A","B","C");
    }

    //Array elemanlarını al. => stream()
    //isim uzunluğu 5'ten büyük olanların toplam harflerini geri getir. => 5'ten uzun isimleri filtrele =>filter()
    //geri kalan listedeki tüm harflerin sayısını getir =>mapToInt
    // harf sayılarını topla => sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5) //Stream<String> if(name.length() > 5) filter ile bu aynı işlevde.
                .mapToInt(name ->name.length()) //Stream<Integer>
                .sum(); //Stream ınteger değerleri topladık.
    }
}


//filter() => verdiğimiz if'e karşılık gelen değerleri getirir, karşılık gelmeyenleri de siler.
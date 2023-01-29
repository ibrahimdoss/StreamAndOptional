package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


    }

    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }


    public static Collection<String> mapToUppercase2(String... names) {
        return Arrays.stream(names)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

    }
}
//gelen array streame çevirildi.
// map dedikten sonra for döngüsü başlıyor diyebiliriz yukarıdakine eş olarak.
        //1.elemanı name atıyor işlem yapıyor sonra tekrar 2.yi name atıo bu şekilde ilerliyor.
        //artık işlemler bittiğinde streami artık collecte atmamız gerekiyor onu da collect ile
        //yapıyoruz.



        //return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList()); //1
        //1 numaralı çözümdeki mapde kullanılan :: lambda fonksiyonu eğer map içerisinde birden fazla işlem yapacaksak
        //kullanamayız, yani uppercase yanına substring işlemi veya split işlemi gibi başka işlem de olsaydu kullanulamazdı.





    //1- Array elemanlarının tamamını al = stream
    //2 - Büyük harflere çevir. = map
    //3 - liste olarak geri dön. = collect()

//yukarıdaki for döngüsünü streame çevirmek için işlevleri sıralandı.
//ardından ilk işlemde for döngüsü gibi tamamını alıp dönmemiz gerek o yüzden bu streame eş değer = stream
// 2.işlemde bir transformasyon işlemi var yani yapacağımız işlev = map e eşit. = map
// 3.işlem ise en son list olarak döneceğimiz için collect methoduna denk geliyor = collect()

 //Arrays.asList(names) aldığı arrayi liste çeviriyor.
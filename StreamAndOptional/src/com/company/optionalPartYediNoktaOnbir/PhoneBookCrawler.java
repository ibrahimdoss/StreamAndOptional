package com.company.optionalPartYediNoktaOnbir;

import java.util.ArrayList;
import java.util.Optional;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseThrow(()->new IllegalArgumentException("No phone number"));
        //yukarıdaki eğer gönderdiğimiz name parametresi olmazsa orElseThrow çalışacak ve IllegalArgumentException fırlatacak.
    }
    //olmaması durumunda çalıştırabileceğimiz optional da üç method var
    // orElse, orElseThrow, orElseGet

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
/*
        final StringBuilder result = new StringBuilder();
        return phoneBook.findPhoneNumberByName(name).ifPresentOrElse(result::append,
                () -> System.out.println(phoneBook.getPhoneBookEntries()));
*/return null;

        //yukarıdaki name değerini verdiğimizde eğer ona karşılık gelen phone number yoksa bütün değerleri yazdıracağız.
    }


    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
       /* Optional<String> phoneNumberOptional = phoneBook.findPhoneNumberByName(name);
        Optional<String> phoneNameOptional = phoneBook.findNameByPhoneNumber(name);

        if (phoneNumberOptional.isPresent()){
            return phoneNumberOptional.get();
        }else if (phoneNameOptional.isPresent()){
            return phoneNameOptional.get();
        }*/
        //return new ArrayList<>(phoneBook.getPhoneBookEntries().values()).get(0);
        /*return phoneBook.findPhoneNumberByName(name).or(()->phoneBook.findNameByPhoneNumber(phoneNumber))
                .orElse(phoneBook.findPhoneNumberByName("Jos de Vos"))
                .orElse(null);*/
        return phoneBook.findPhoneNumberByName(name)
                .orElse(phoneBook.findNameByPhoneNumber(phoneNumber)
                    .orElse(phoneBook.findPhoneNumberByName("Jos de Vos")
                        .orElse(null)));
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }
}

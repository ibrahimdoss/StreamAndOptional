package com.company.partDortNoktaIki;

import java.util.List;

public class SumAndReduce {

    public static void main(String[] args) {

    }

    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate2(List<Integer> numbers) {
       return numbers.stream()
               .reduce(Integer::sum).orElse(0);
    }
}

// i ve sum değerleri i listeden geliyor indexten yani i girdiği zaman sum 0 atanıyor daha sonra i + sum sonucunu tekrar
// sum değerine atayarak i'yide 2.değer olarak atıyor.  böylelikle listeyi azaltıp toplamış oluyor.


//reduce azaltarak yani büyük bir parçayı azaltarak sonuna kadar gidiyor anlamında
//yani her döngüde bi tanesini alıp oradan çıkartıp bir şeye eşitliyor.Bütünden parça azaltıyor mantığı ile düşünülebilir.
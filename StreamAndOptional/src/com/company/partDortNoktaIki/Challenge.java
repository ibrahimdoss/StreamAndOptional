package com.company.partDortNoktaIki;

import java.util.List;
import java.util.stream.Collectors;

public class Challenge {



    public static String getString(List<Integer> list) {

        return list.stream()
                .map(i-> {
                    String s = "";
                    if (i % 2 == 0){
                        s+= "e" +i;
                    }else {
                        s+= "o" +i;
                    }
                    return s;
                })
                .collect(Collectors.joining(","));
    }
}


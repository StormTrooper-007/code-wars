package org.example.kyu6;

import java.util.*;

public class CounterCharactersinString {
    public Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int number = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    number++;
                }
            }
            map.put(str.charAt(i), number);
            number = 0;
        }
        return map;
    }
}

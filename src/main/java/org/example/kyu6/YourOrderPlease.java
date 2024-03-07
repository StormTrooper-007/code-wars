package org.example.kyu6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class YourOrderPlease {
    Comparator<String> c = new StringComparator();
    public String order(String words) {
       return Arrays.stream(words.split(" "))
               .toList()
               .stream().sorted(c).collect(Collectors.joining(" "));
    }

    static class StringComparator implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            int n1 = extractNumber(s1);
            int n2 = extractNumber(s2);
            return Integer.compare(n1, n2);
        }
        private int extractNumber(String s){
            String numberString = s.replaceAll("\\D", "");
            return Integer.parseInt(numberString);
        }
    }
}

package org.example.kyu6;

import java.util.stream.Stream;

public class Diamond {

    StringBuilder diamondTop = new StringBuilder();
    StringBuilder diamondBase = new StringBuilder();

    int expectedNumberOfStars = 1;
    StringBuilder finalResult = new StringBuilder();

    public static boolean checkOddandNegativeValue(int num){
        if(num%2 == 0) return false;
        return num >= 0;
    }

    String spaceForTop = "";
    String spaceForBase = "";

    public String print(int n) {
        boolean checker = checkOddandNegativeValue(n);
        int j = (int)Math.floor((double)n/2);
        if(checker){
            for(int i=0; i <= n; i+=2){
                String stars = Stream.generate(() -> "*")
                        .limit(expectedNumberOfStars).reduce("", String::concat);
                spaceForTop = " ".repeat(j);
                diamondTop.append(spaceForTop).append(stars).append("\n");
                j--;
                expectedNumberOfStars+=2;
                spaceForTop = "";
            }
            j = 1;
            for(int i=n-2; i > 0; i-=2){
                String stars = Stream.generate(() -> "*")
                        .limit(i).reduce("", String::concat);
                spaceForBase = " ".repeat(j);
                diamondBase.append(spaceForBase).append(stars).append("\n");
                j++;
                spaceForBase = "";
            }
            finalResult = diamondTop.append(diamondBase);
            return finalResult.toString();
        }else{
            return null;
        }
    }
}

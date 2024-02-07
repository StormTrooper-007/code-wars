package org.example.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeTheDeadfishSwim {
     int index = 0;
     int number = 0;

    int numberOfOutputEvents = 0;

    List<Integer> list = new ArrayList<>();

    char currentChar;

    public void checkCharacter(char character){
        if(character == 'i'){
            number++;
        } else if (character == 'd') {
            number--;
        } else if (character == 's') {
            double v = Math.pow(number, 2);
            number = (int)v;
        } else if (character == 'o') {
            list.add(number);
            numberOfOutputEvents++;
        }
    }
    public int[] parse(String data) {
        char[] charArray = data.toCharArray();

        while (index < charArray.length) {
            currentChar = charArray[index];
            checkCharacter(currentChar);
            index++;
        }
        int[] finalResult = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            finalResult[i] = list.get(i);
        }
        System.out.println(Arrays.toString(finalResult));
        return finalResult;
    }
}


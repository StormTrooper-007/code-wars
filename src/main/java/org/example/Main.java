package org.example;

import org.example.kyu6.HumanReadableTime;


public class Main {
   public static void main(String[] args){
       HumanReadableTime h = new HumanReadableTime();
       System.out.println(h.makeReadable(359999));
   }
}
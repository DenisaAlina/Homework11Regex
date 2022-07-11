package com.fasttrack;

public class Regex {
    public static void main(String[] args) {
        String text ="Ana are doua kilograme de  mere. Merele sunt dulci si bune.Merele ei nu sunt ale mele. A face prajituri e un mare  mestesug. ";
        System.out.println(text.replaceAll("\\b(m|M)[a-zA-Z]*e\\b" , "*"));
        String input = "124.2";
        if(input.matches("[0-9]*\\.?[0-9]*")){
            double i = Double.parseDouble(input);
            System.out.println(i/2);
        }else{
            System.out.println("The string is not a floating point number!");
        }
    }
}

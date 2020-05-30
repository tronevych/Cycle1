/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Serhii Tronevych KNUTE
 */


package com.company;

public class Main {

    public static  void main(String[] args) {
        // Task1 Write to console 8 facts about yourself using primitive types.
        int age = 21;
        byte day = 19;
        float height = 183.5f;
        short one = 1;
        long two = 2;
        char play = '4';
        double see = 3;
        double result = (day) - (two + one);
        String aboutMyself = "My name is Serhii. I am " + age + "years old. " +
                "My height is " + height + " cm. I was born on the " + day +
                " July. I have " + one + " big dog and " + two + " small. Love " +
                "play volleyboll with my " + play + " friends\n and  love" +
                " watching movies in " + see + "d. I know my friends already " +
                result + " years                            ";
        System.out.println(aboutMyself);
        System.out.println(aboutMyself.length());

        // Check a string as a palindrome.

        // String sentence = "Умер, и мир ему.";
        // String sentence = "Морда казака за кадром.";
        // String sentence = "Ого, вижу живого";
        // String sentence = "А щётка – как тёща!";
        // String sentence = "Лидер бодро, гордо бредил";

        String sentence = "Аргентина манит негра";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll(" ", "")
                .replaceAll("\\.", "")
                .replaceAll("-", "")
                .replaceAll("–", "")
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "")
                .replaceAll("«", "")
                .replaceAll("»", "")
                .replaceAll("\\!", "");

        String template = "";

        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.length() - i - 1;
            template += sentence.charAt(index);
        }

        System.out.println(template);

        if (sentence.equals(template)) {
            System.out.println("This sentence is palindrom - TRUE");
        } else {
            System.out.println("This sentence is not palindrom - FALSE");
        }

        // Task4. Get the area limited by the following functions.
        // M 'y' = 0.3

        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.3;

        double area = 0;

        for (double x = 0; x < finish; x += deltaX) {
            double rectangle = 0;
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }

            area += rectangle;
        }

        System.out.println(area);
    }

}



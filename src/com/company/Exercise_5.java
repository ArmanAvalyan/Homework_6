/* Create a function that takes a string and returns a new string with each new
character accumulating by +1. Separate each set with a dash */

package com.company;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        accum(text);
    }

    static void accum(String text) {
        String txt = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            for (int j = 0; j <= i ; j++) {
                if (j == 0)
                    txt += Character.toUpperCase(c);
                else
                    txt += Character.toLowerCase(c);
            }
            txt += "-";
        }
        System.out.println(txt.substring(0, txt.length()-1));

    }
}

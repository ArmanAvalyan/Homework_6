/* Create a function that takes a string and returns a new string with each new
character accumulating by +1. Separate each set with a dash. */

package com.company;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        String result = accum(text);
        System.out.println("(" + text + ") ➞ " + result);
    }

    static String accum(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    result += Character.toUpperCase(c);
                else
                    result += Character.toLowerCase(c);
            }
            result += "-";
        }
        result = (result.substring(0, result.length() - 1));

        return result;
    }
}

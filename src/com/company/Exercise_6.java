/* Create a function that returns a capitalized version of the string passed.
The first letter of each word in the string should be capitalized while the rest should be in lowercase. */

package com.company;

import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        String result = emphasize(text);
        System.out.println("(" + text + ") ➞ " + result);
    }

    static String emphasize(String text) {
        String[] strArray = text.split(" ");
        String result;
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1).toLowerCase();
        }
        result = String.join(" ", strArray);

        return result;
    }
}

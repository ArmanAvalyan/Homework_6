/* Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there. */

package com.company;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        System.out.println("extraFront(" + text+ ") → " + extraFront(text));

    }

    static String extraFront(String text) {
        if (text.length() < 2)
            return text.concat(text.concat(text));
        else {
            String newText = text.substring(0, 2);
            return newText.concat(newText.concat(newText));
        }
    }
}

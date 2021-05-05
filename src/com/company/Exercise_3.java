// Given a string, return a string where for every char in the original, there are two chars.

package com.company;

import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        String result = doubleChar(text);
        System.out.println("(" + text + ") → " + result);
    }

    static String doubleChar(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText += text.charAt(i) + text.substring(i, i + 1);
        }
        return newText;
    }
}

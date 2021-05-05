/* Given a string, return a string length 1 from its front, unless front is false, in
which case return a string length 1 from its back. The string will be non-empty. */

package com.company;

import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        boolean front;
        System.out.print("Front is true or false? ");
        front = scanner.nextBoolean();
        String newText = theEnd(text, front);
        System.out.println("(" + text + ", " + front + ")" + " → " + newText);
    }

    static String theEnd(String text, boolean front) {
        if (front) {
            return text.substring(0, 1);
        } else
            return text.substring(text.length() - 1);
    }
}

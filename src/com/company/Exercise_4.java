/* Given a string, return true if the number of appearances of "is" anywhere in the string is equal
to the number of appearances of "not" anywhere in the string. */

package com.company;

import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        boolean equals = equalsNote(text);
        System.out.println("(" + text + ") → " + equals);
    }

    static boolean equalsNote(String text) {
        int is = 0;
        int not = 0;
        if (text.length() <= 2 && text.endsWith("is"))
            is++;
        for (int i = 0; i <= text.length(); i++) {
            if (text.startsWith("is", i))
                is++;
            else if (text.startsWith("not", i))
                not++;
        }

        return is == not;
    }
}

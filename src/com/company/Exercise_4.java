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
        System.out.println(equals);
    }

    static boolean equalsNote(String text) {
        int is = 0;
        int not = 0;
        if (text.length() <= 2 && text.substring(text.length() - 2).equals("is"))
            is++;
        for (int i = 0; i <= text.length() - 3; i++) {
            if (text.substring(i, i + 2).equals("is"))
                is++;
            else if (text.substring(i, i + 3).equals("not"))
                not++;
        }
        System.out.println(is + " " + not);
        System.out.println(text.length());
        return is == not;
    }
}

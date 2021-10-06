package main.java;

import java.util.Scanner;

public class AssignmentString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a single character: "  );
       char c1 = scan.nextLine().charAt(0);
        String text = "Mark Zuckerberg has hit back at the festimony of the Facebook whistleblower Frances Haugen, saying that her claims are “just not true”.";
        int lenght = text.length();
        if (lenght > 500 ) {
            System.out.println("Write a shorter text now!");

        }

    }
    public static String replaceChar ( String original, char letter1, char letter2) {
        String changed = original.replace('f', 't');
        return changed;




    }


}


/*
 * Todo:
 *   * välj ett ord
 *     - statisk
 *     - user input?
 *     - från en lista?
 *     - från en fil?
 *     - från en hemsida
 *   * använder väljer en bokstav
 *   * finns bokstaven i ordet?
 *       - var är bokstaven?
 *       - visa bokstaven
 *       - bli av med försök
 *   * loopa tills
 *       - ordet är helt
 *       - inga liv
 *   */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("HangedMan");

        //choose a word
        String myWord = "viking";
        //Split the word
        String[] sWord = new String[myWord.length()];
        sWord = myWord.split("");

        //print letters
        /*
        for (int i = 0; i < sWord.length; i++) {
            System.out.println(sWord[i]);
        }*/

        Scanner myScanner = new Scanner(System.in);
        String guess = myScanner.next();
        System.out.println("user guess: " + guess);
    }
}

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

        String[] revWord = new String[sWord.length];
        int count = 0;
        while (count < revWord.length) {
            revWord[count] = "_";
            count++;

        }

        //set lives
        int lives = 5;
        boolean wordHid = false;

        Scanner myScanner = new Scanner(System.in);

        while (lives > 0) {

            wordHid = true;
            System.out.println("\nEnter guess: ");
            String guess = myScanner.next();

            Boolean letterEx = false;

            for (int i = 0; i < sWord.length; i++) {
                if (guess.equals(sWord[i])) {
                    System.out.println("bokstaven " + sWord[i] + " finns på plats " + (i + 1));
                    revWord[i] = guess;
                    letterEx = true;
                }
                if ("_".equals(revWord[i])) {
                    wordHid = false;
                }
            }

            if (!letterEx) {
                lives--;
            }


            printArr(revWord);
            System.out.println();
            System.out.println("you have " + lives + " lives");
        }

    }

    public static void printArr(String[] myArr) {
        System.out.println();
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);
        }
    }

}
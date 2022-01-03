package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        String aliceInWonderLandSampleText = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?";

        String uppercaseText = aliceInWonderLandSampleText.toUpperCase();

        System.out.println("What term do you want to search for in Alice's Adventures in Wonderland:");

        String search = input.nextLine().toUpperCase();


        input.close();

        Boolean searchResults = (uppercaseText.contains(search));

        System.out.println("It is " + searchResults + " that " + search +
                " is found in the first line of Alice in Wonderland. Bet you didn't know that before, did yeah?");






    }

}

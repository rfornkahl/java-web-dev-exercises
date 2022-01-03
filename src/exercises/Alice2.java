package exercises;

import java.util.Scanner;

public class Alice2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String aliceInWonderLandSampleText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

        //System.out.println(aliceInWonderLandSampleText);

        aliceInWonderLandSampleText = aliceInWonderLandSampleText.toUpperCase();

        System.out.println("What term do you want to search for in Alice's Adventures in Wonderland:");

        String name = input.nextLine();
        name = name.toUpperCase();

        input.close();

        Integer index = (aliceInWonderLandSampleText.indexOf(name));
        Integer length = (name.length());

        System.out.println("Your search term " + name + " is first found at the " + index + " index of the sentence, " +
                "it's length is " + length + " characters.");

        String newAliceInWonderLandSampleText = aliceInWonderLandSampleText.replace(name,"" );
        System.out.println(newAliceInWonderLandSampleText);


    }

}

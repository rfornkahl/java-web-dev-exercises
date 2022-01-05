package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;

public class ArrayList_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);


        ArrayList<String> countLetters = new ArrayList<String>();
        countLetters.add("Diane");
        countLetters.add("Jimmy");
        countLetters.add("Luther");
        countLetters.add("Suzanne");
        countLetters.add("Jaymes");
        countLetters.add("Hillbilly Jim");
        countLetters.add("Slim");
        countLetters.add("Johnny Boy");

    System.out.println("How many letters would you like to search for words by: ");
    int length = input.nextInt();

    for (int i=0; i< countLetters.size(); i++){
       if(countLetters.get(i).length() == length){
           System.out.println(countLetters.get(i));
       }
    }

    }

}


package exercises.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Practice {
    public static void main(String[] args) {

        HashMap<String, Integer> IDs = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student (or ENTER to finish):");

        //Get student names and ids

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                int newStudentID = input.nextInt();
                IDs.put(newStudent, newStudentID);

                input.nextLine();
            }
        }
            while (!newStudent.equals("")) ;

            System.out.println("\nClass roster: ");

            for (Map.Entry<String, Integer> ID : IDs.entrySet()) {
                System.out.println(ID.getKey() + "'s Student ID is (" + ID.getValue() + ")");
            }
        }

    }



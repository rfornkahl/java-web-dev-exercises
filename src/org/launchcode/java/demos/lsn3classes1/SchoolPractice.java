package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student rob = new Student("Robert", 1, 1, 4.0);
        Student sam = new Student("Sammie", 2, 80, 3);
        System.out.println("Name: " + sam.getName());
        System.out.println("Student ID: " + sam.getStudentId());
        System.out.println("Number of Credit Hours: " + sam.getNumberOfCredits());
        System.out.println("GPA: " + sam.getGpa());
        System.out.println(sam.getName() + " is a " + sam.addGradeLevel(15));
        sam.addGrade(4, 3.5);
        System.out.println("GPA: " + sam.getGpa());
        System.out.println("Number of Credit Hours: " + sam.getNumberOfCredits());
        // Instantiate your Student class for part 2 here!
        System.out.println("\n");
        System.out.println("Name: " + rob.getName());
        System.out.println("Student ID: " + rob.getStudentId());
        System.out.println("Number of Credit Hours: " + rob.getNumberOfCredits());
        System.out.println("GPA: " + rob.getGpa());
        System.out.println(rob.getName() + " is a " + rob.addGradeLevel(30));
        rob.addGrade(4, 3.0);
        System.out.println("GPA: " + rob.getGpa());
        System.out.println("Number of Credit Hours: " + rob.getNumberOfCredits());

    }

}


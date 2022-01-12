package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student sam = new Student("Robert", 1, 1, 4.0);
        System.out.println("Name: " + sam.getName());
        System.out.println("Student ID: " + sam.getStudentId());
        System.out.println("Number of Credit Hours: " + sam.getNumberOfCredits());
        System.out.println("GPA: " + sam.getGpa());
        // Instantiate your Student class for part 2 here!
    }
}


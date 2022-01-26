package org.launchcode.java.demos.lsn4classes2;

public class Main {
    public static void main(String[] args) {
        Student person = new Student("Violet");
        System.out.println(person.toString());


        Student bono1 = new Student("Paul David Hewson", 4);
        Student bono2 = new Student("Bono", 4);

        if(bono1.equals(bono2)){
            System.out.println(bono1.getName() + " is the same as " + bono2.getName());
        }
    }
}

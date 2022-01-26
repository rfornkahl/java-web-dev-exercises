package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());


        HouseCat spike = new HouseCat("Spike");
        System.out.println("The cat named " + spike.getName() + ", weights " + spike.getWeight() + " lbs");

        //Cat plainCat = new Cat(8.6);
        HouseCat felixTheCat = new HouseCat("Felix", 12);

        //System.out.println("When a plain cat makes a noise, it makes this noise " + plainCat.noise());
        System.out.println("When " + felixTheCat.getName() + " makes a noise. He makes this noise. " + felixTheCat.noise());
    }
}

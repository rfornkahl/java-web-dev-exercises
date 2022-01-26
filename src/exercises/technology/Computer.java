package exercises.technology;

import java.util.Date;

public abstract class Computer {

    //Set parameters numberOfUsers, lastUsedInDays, yearBuilt
    public static int numberOfUsers;
    public static int lastUsedInDays;
    public static int yearBuilt;

    public Computer (int numberOfUsers, int lastUsedInDays, int yearBuilt){
        this.numberOfUsers = numberOfUsers;
        this.lastUsedInDays = lastUsedInDays;
        this.yearBuilt = lastUsedInDays;
    }

    //Establish Getters and Setters
    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public int getLastUsedInDays() {
        return lastUsedInDays;
    }

    public void setLastUsedInDays(int lastUsedInDays) {
        this.lastUsedInDays = lastUsedInDays;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

public static boolean whenToReplace(int yearBuilt) {
    int yearReplace = 0;
    //Date d = new Date();
    //int year = d.getYear();
    //int currentYear = year + 1900;
    int currentYear = 2022;

    if (currentYear - yearBuilt > 3) {
        return true;
    } else if (currentYear - lastUsedInDays > 3650) {
        return true;
    } else {
        return false;
    }
}

public static String publicOrPrivate(){
        String userType = null;

        if (numberOfUsers > 1){
            userType = "Public";
        } else if (numberOfUsers == 1){
            userType = "Private";
        }
        return userType;
}



    public abstract int ID();


    //Establish ID for the device, that is required for each class, but has to be set by the device.
    //public abstract int ID();
}
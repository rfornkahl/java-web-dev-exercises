package exercises.technology;


public class SmartPhone extends Computer{
    private static String brand;


    public SmartPhone(int numberOfUsers, int lastUsedInDays, int yearBuilt, String brand) {
        super(numberOfUsers, lastUsedInDays, yearBuilt);
        this.brand = brand;
    }


    public static String smartphoneDescription =
        "This " + brand + "Laptop was built in " +
                yearBuilt + ". It is  " + Computer.whenToReplace(yearBuilt) +
            "that it is going to be replaced. and is considered to be a " + publicOrPrivate() + " machine." ;


    public void phoneDescription(){
        System.out.println(smartphoneDescription);
    };

    @Override
    public int ID() {
        return 2;
    }
}

package exercises.technology;

public class Laptop extends Computer {
    private static String brand;


    public Laptop(int numberOfUsers, int lastUsedInDays, int yearBuilt, String brand) {
        super(numberOfUsers, lastUsedInDays, yearBuilt);
        this.brand = brand;
    }



    public static String laptopDescription = "This " + brand + "Laptop was built in " +
                yearBuilt + ". It is  " + Computer.whenToReplace(yearBuilt) +
                "that it is going to be replaced. and is considered to be a " + publicOrPrivate() + " machine." ;


    public void pcDescription(){
        System.out.println(laptopDescription);
    };

    @Override
    public int ID() {
        return 1;
    }
}

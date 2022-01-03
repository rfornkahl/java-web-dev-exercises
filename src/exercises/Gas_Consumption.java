package exercises;

import java.util.Scanner;

public class Gas_Consumption {
    public static void main(String[] args) {
        double milesDriven;
        double gasConsumed;
        double MPG;
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive:");
        milesDriven = input.nextDouble();

        System.out.println("How many gallons of gasoline did you use:");
        gasConsumed = input.nextDouble();

        input.close();

        MPG = milesDriven/gasConsumed;

        System.out.println("Your vehicle's miles per gallon is " + MPG + ".");

    }
}

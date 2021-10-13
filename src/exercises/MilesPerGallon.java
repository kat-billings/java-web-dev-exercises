package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner milesInput = new Scanner(System.in);
        System.out.println("Miles:");
        double miles = milesInput.nextDouble();
        Scanner gallonsInput = new Scanner(System.in);
        System.out.println("Gallons:");
        double gallons = gallonsInput.nextDouble();
        double mpg = miles/gallons;
        System.out.println(mpg+" miles-per-gallon");
    }
}

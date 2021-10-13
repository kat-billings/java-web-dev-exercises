package org.launchcode.java.studios.areaofacircle;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius;
        boolean check;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Radius: ");
            radius = input.nextDouble();
        } while (radius < 0);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
    }
}

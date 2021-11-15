package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.ConsoleHandler;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor f: flavors){
            System.out.println(f.getName() + ": $" + f.getCost());
        }
        System.out.println("\n");
        for (Cone c: cones){
            System.out.println(c.getName() + ": $" + c.getCost());
        }
    }
}

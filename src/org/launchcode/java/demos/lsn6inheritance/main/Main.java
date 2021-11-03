package org.launchcode.java.demos.lsn6inheritance.main;

public class Main {
    public static void main(String[] args) {
        HouseCat maxwell = new HouseCat("Maxwell", 17);
        maxwell.eat();
        System.out.println(maxwell.isTired());
        Cat plainCat = new Cat(8.6);
        HouseCat laser = new HouseCat("Laser", 12);

        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(laser.noise()); // prints "Hello, my name is Cheshire!"
    }
}

package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Length:");
        double length = lengthInput.nextDouble();
        Scanner widthInput = new Scanner(System.in);
        System.out.println("Width:");
        double width = widthInput.nextDouble();
        double area = length * width;
        System.out.println("The area is " + area);
    }
}

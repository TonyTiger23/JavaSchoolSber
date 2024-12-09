package org.example;
import java.util.Scanner;

public class TemperatureInput {
    private final Scanner scanner = new Scanner(System.in);

    public double getInput() {
        System.out.println("Enter temperature in Celsius: ");
        return scanner.nextDouble();
    }
}

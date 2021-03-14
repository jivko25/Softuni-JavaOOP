package EncapsulationTask2AnimalFarm;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();
    int age = Integer.parseInt(scan.nextLine());

    try {
        Chicken chicken = new Chicken(name, age);
        System.out.println(chicken);
    } catch (IllegalArgumentException iae) {
        System.out.println(iae.getMessage());
    }
}

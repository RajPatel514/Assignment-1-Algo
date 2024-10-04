package com.mycompany.paintjob;

import java.util.Scanner;

/**
 *
 * @author Raj
 */
public class Paintjob {

    static final double COVERAGE_PER_GALLON = 300.0;
    static final double HOURLY_RATE = 20.0;
    static final double HOURS_PER_GALLON = 8.0;
    //declared as constants
    //decalred as global constants

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter dimesntions of a wall in Feet: H x W");
        double wallHeight = input.nextDouble();
        double wallWidth = input.nextDouble();

        System.out.println("Enter the number walls to be painted");
        int numWalls = input.nextInt();

        double wallArea = calculateArea(wallHeight, wallWidth, numWalls);
        
        // DOORS
        System.out.println("Enter dimesntions of a door in Feet: H x W");
        double doorHeight = input.nextDouble();
        double doorWidth = input.nextDouble();

        System.out.println("Enter the number doors");
        int numDoor = input.nextInt();
        double doorArea = calculateArea2(doorHeight, doorWidth, numDoor);

        // Windows
        System.out.println("Enter dimesntions of a window in Feet: H x W");
        double winHeight = input.nextDouble();
        double winWidth = input.nextDouble();

        System.out.println("Enter the number windows");
        int numWin = input.nextInt();

        double winArea = calculateArea3(winHeight, winWidth, numWin);

        double totalArea = wallArea - doorArea - winArea;

        double numGallons = Math.ceil(totalArea / COVERAGE_PER_GALLON);

        double labourHours = numGallons * HOURS_PER_GALLON;
        double labourPrice = labourHours * HOURLY_RATE;

        System.out.println("Enter the price for one gallon of paint");
        double priceGal = input.nextDouble();

        double totalGalPrice = priceGal * numGallons;

        double totalPrice = totalGalPrice + labourPrice;

        System.out.println("Number of gallons needed: " + numGallons);
        System.out.println("The total cost of paint: " + totalGalPrice);
        System.out.println("The total hours of labor needed: " + labourHours);
        System.out.println("The total cost labour: " + labourPrice);
        System.out.println("The total cost of the paint job: $" + totalPrice);

    input.close();
    }

    public static double calculateArea(double wallHeight, double wallWidth, int numWalls) {
        return wallHeight * wallWidth * numWalls;
    }

    public static double calculateArea2(double doorHeight, double doorWidth, int numDoor) {
        return doorHeight * doorWidth * numDoor;

    }

    public static double calculateArea3(double winHeight, double winWidth, int numWin) {
        return winHeight * winWidth * numWin;

    }

}

//        System.out.println("enter the dimesntions/number of " + type + "in feet");
//        double height = sc.nextDouble();
//        double width = sc.nextDouble();
//        int num = sc.nextInt();
//        
//        double area;
//        area = height * width * num;
//        return area;
//    System.out.println("enter dimesntions of walls in ffeet");
//    double doorHeight = input.nextDouble();
//    double doorWidth = input.nextDouble();
//    int numDoor = input.nextInt();
//    double doorArea = calculateArea(input,"door");
//
//    System.out.println("wall Area" + wallArea);
//    System.out.println("door Area" + doorArea);

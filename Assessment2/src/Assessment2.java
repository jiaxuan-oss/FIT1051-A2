import java.util.Scanner;
/*
 * Assessment 2
 *
 * Copyright (c) 2022  Monash University
 *
 * Written by  Jonny Low
 *
 *
 */
public class Assessment2 {
    public static void main(String[] args){

        Assessment2 a2 = new Assessment2();

        // Instruction: To run your respective task, uncomment below individually
//        a2.task1(2);
////        test values for task1
//        //testing boundary 1 to 100
//        a2.task1(-1);
//        a2.task1(0);
//        a2.task1(1);
//
//        //testing boundary 1 to 100
//        a2.task1(99);
//        a2.task1(100);
//        a2.task1(101);
//
//        //testing boundary 40 to 50
//        //not even integer
//        a2.task1(40);
//        a2.task1(41);
//        a2.task1(49);
//        a2.task1(50);
//
//        //testing huge odd
//        //testing huge even number
//        a2.task1(1001);
//        a2.task1(1002);
//
//        a2.task2();
//        a2.task3();
//        a2.task4();
//
////        test your task 5 here
//        double radius,height;
//        radius = 3;
//        height = 7;
//        System.out.printf(String.format("The volume of a cylinder for radius %.1f and height %.1f is %.2f cm^3.", radius,height,a2.volumeOfACylinder(radius, height)));
    }

    private void task1(int n){
        // code your task 1 here
        //declare
        boolean condition1, condition2, result;

        //conditions: 1 to 100 but not even integers between 40 and 50
        condition1 = n>=1 && n <=100;
        condition2 = n%2 !=0 || (n<40 || n>50);
        result = condition1 && condition2;

        //output
        System.out.println("For the number " + n + " the value is " + result);
    }

    private void task2(){
        // code your task 2 here
        //declared and initialised
        boolean testCase1, testCase2,tempVariable;
        testCase1 = true;
        testCase2 = false;

        //before switch
        System.out.println("Before swap:\n" + "testCase1: " + testCase1 + "\ntestCase2: " + testCase2 );

        //swapping variables
        tempVariable = testCase1;
        testCase1 = testCase2;
        testCase2 = tempVariable;

        //after switch
        System.out.println("\nAfter swap:\n" + "testCase1: " + testCase1 + "\ntestCase2: " + testCase2 );

    }

    private void task3(){
        // code your task 3 here
        //declared variable
        double angleAlpha, angleBeta, alphaInRadian,betaInRadian,buildings,width,length,areaOfSpace,dimensionStoneSlabs, stoneSlabsRequired;

        //initialised values
        angleAlpha = 53.13;
        angleBeta = 41.00;
        buildings = 20.00;
        dimensionStoneSlabs = 1*1;

        //convert to radian
        alphaInRadian = (Math.PI/180)*angleAlpha;
        betaInRadian =  (Math.PI/180)*angleBeta;

        //calculate width and length
        width = buildings/Math.tan(alphaInRadian);
        length = buildings/Math.tan(betaInRadian);

        //calculating area
        areaOfSpace = width * length;

        //stone slabs required
        stoneSlabsRequired = Math.ceil(areaOfSpace/dimensionStoneSlabs);

        //output the result
        System.out.printf("Width of space between building A and B: %.2f" , width);
        System.out.printf("\nLength of space between building A and B: %.2f" , length);
        System.out.printf("\nArea of space between building A and B: %.2f" , areaOfSpace);
        System.out.println("\nStone slabs needed for the space: " + stoneSlabsRequired);


    }

    private void task4(){
        // code your task 4 here
        //declaration
        int x,y,bitwiseAND,bitwiseXOR;

        Scanner scanner = new Scanner(System.in);

        //asking input for x example:12
        System.out.println("Input for x: ");
        x = scanner.nextInt();

        //asking input for y example: 5
        System.out.println("Input for y: ");
        y = scanner.nextInt();

        //output
        bitwiseAND = x&y;
        bitwiseXOR = x^y;

        System.out.println("Bitwise AND (a&b) = " + bitwiseAND + "\n" + "Bitwise exclusive OR (a^b) = " + bitwiseXOR);

        //Explantion:
        //the binary for x and y would be 1111 which are 8+4+2+1=15 respectively when convert to decimal
        //when the binary is 1 it indicates that the number will be sum up
        //for example, binary for x would be 1100 and y would be 0101
        //Bitwise AND will turn from 0 to 1 when two of the bits are 1
        //For example, 1100 and 0101 the first bit of these two binaries are 1 and 0
        //Hence, first bit of x&y would be 0
        //for bitwise exclusive OR, if both bits are 1 or 0 the corresponding bit will be set to 0
        //for x first bit is 1 and y first bit is 0
        //Thus, the first bit of x^y would be 1 as first bit of x and y are 1 and 0
        //lastly for bitwise AND the result would be 0100 which is 4
        //for bitwise exclusive OR the result would be 1001 8+1 = 9
    }

    // Code your task 5 method here
    public double volumeOfACylinder(double radius, double height){
        //declaration
        double volumeOfCylinder,areaOfCylinder;

        //calculate area and volume
        areaOfCylinder = Math.PI * Math.pow(radius,2);
        volumeOfCylinder = areaOfCylinder * height;

        //return volume
        return volumeOfCylinder;
    }
}


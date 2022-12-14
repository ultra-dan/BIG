//https://www.rapidtables.com/calc/grade/gpa-calculator.html
//stuff I can recreate^^^^^

import java.util.Scanner; //scanner

import static java.lang.Math.*; //math

import java.util.*; //<ArrayList>

public class GradeCalculator {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program that calculates your grade!\n" +
                "Enter the percent of an assignment then the percent weight.\n" +
                "That's it, have fun! :)" +
                "Coming soon: How to calculate your GPA????\n" +
                "0) weightGrade\n" +
                "1) GPAcalculator");
        try {
            boolean play = true;
            while (true) {
                System.out.println("Which option?\nEnter a number:");
                int num = scan.nextInt();
                switch (num) {
                    case 0:
                        weightGrade();
                        break;
                    case 1:
                        GPAcalculator();
                        break;
                    default:
                        throw new NumberFormatException("incorrect input!");
                }//end case
            }//end while
        }//end try
        catch (InputMismatchException e) {
            System.out.println("Enter a number: ");
            scan.nextInt();//how does this work? check the text editor -- Even if the wrong input is entered, the program still runs
        }//end 1 catch
        catch (Exception e) {
            System.out.println("Unknown problem! STOP");
            System.exit(0);
        }//end 2 catch
    }//end main


    public static void weightGrade() {
        /*
        Asks for weight and grade of each assignment and the grade
        accumulates after each assignment entered
         */
        boolean go = true;
        double grade = 0;
        double weightXScore = 0, weightTotal = 0;
        int totalNumOfAssignments = 0;
        while (go) {
            System.out.println("Welcome to weightGrade!\nEnter Assignment grade percent: ");
            double score = scan.nextDouble();
            System.out.println("Enter Assignment Weight:");
            double weight = scan.nextDouble();
            weightXScore += (weight) * (score);
            weightTotal += weight;

            //another weight
            System.out.println("Another assignment(y or n)?");
            String choice = scan.nextLine();
            String choice5 = scan.nextLine();
            if (choice5.equalsIgnoreCase("no") || choice5.equalsIgnoreCase("n")) {
                grade = weightXScore / weightTotal;
                go = false;
            }

        }
        //System.out.println("weightXScore: "+weightXScore+"\n  weightTotal: "+weightTotal );
        System.out.print("Your grade is ");
        System.out.printf("%.2f", grade);
        System.out.print("%");
    }

    public static void GPAcalculator() {
        System.out.println("Your GPA");
        System.out.println("soemtnintes");
        System.out.println("jif peanut butter");
    }


}

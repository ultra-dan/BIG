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
                "Coming soon: How to calculate your GPA????\n");

        boolean play = true;
        while (true) {
            try {
                System.out.println("Main Menu-\n" +
                        " 0) weightGrade\n" +
                        " 1) GPAcalculator\n" +
                        " 2) gradingScale\n" +
                        "Enter a number >>");
                int num = scan.nextInt();
                switch (num) {
                    case 0:
                        weightGrade();
                        break;
                    case 1:
                        GPAcalculator();
                        break;
                    case 2:
                        gradingScale();
                        break;
                    default:
                        throw new NumberFormatException("incorrect input!");
                }//end case
            }//end try
            catch (NumberFormatException e) {
                System.out.println("InputMismatchException: Select a number from the menu!");
                //scan.nextInt();
            }//end 1 catch
            catch (Exception e) {
                System.out.println("Unknown problem! STOP");
                System.exit(0);
            }//end 2 catch
        }//end while
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
        System.out.print("Grade Percent: ");
        System.out.printf("%.2f", grade);
        System.out.println("%");
        calculateLetterGrade(grade);
        System.out.println();
    }

    public static void GPAcalculator() {
        System.out.println("Your GPA");
        System.out.println("soemtnintes");
        System.out.println("jif peanut butter");

    }

    public static void calculateLetterGrade(double grade) {
        if (grade >= 93) {
            System.out.println("Grade Letter: A");
        } else if (grade >= 90) {
            System.out.println("Grade Letter: A-");
        } else if (grade >= 87) {
            System.out.println("Grade Letter: B+");
        } else if (grade >= 83) {
            System.out.println("Grade Letter: B");
        } else if (grade >= 80) {
            System.out.println("Grade Letter: B-");
        } else if (grade >= 77) {
            System.out.println("Grade Letter: C+");
        } else if (grade >= 73) {
            System.out.println("Grade Letter: C");
        } else if (grade >= 70) {
            System.out.println("Grade Letter: C-");
        } else if (grade >= 60) {
            System.out.println("Grade Letter: D");
        } else {
            System.out.println("Grade Letter: F");
        }
    }

    public static void gradingScale() {
        System.out.println("Grading Scale:\n" +
                "A ≥ 93, 90 ≤ A− < 93\n" +
                "87 ≤ B+ < 90, 83 ≤ B < 87, 80 ≤ B− < 83\n" +
                "77 ≤ C+ < 80, 73 ≤ C < 77, 70 ≤ C− < 73\n" +
                "60 ≤ D < 70, F < 60\n");
    }

}

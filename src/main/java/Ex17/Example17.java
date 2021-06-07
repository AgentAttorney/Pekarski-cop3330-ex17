package Ex17;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

// Note: Doesn't Scanner already constrict the data type? It already gives an error/no progress

public class Example17 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 if you are female, 2 if you are male," +
                " and please enter your weight. And don't lie about it. ");
        int gender = input.nextInt();
        int weight = input.nextInt();

        System.out.print("How many ounces of alcohol have you had in the past x hours? ");
        int oz = input.nextInt();
        int hours = input.nextInt();

        if(gender == 1)
        {
            // case Male
            double bac = (oz * 5.14 / weight * 0.73) - 0.015 * hours;
            System.out.print("Your bac is ");
            System.out.printf("%.4f%n",bac);
            if(bac >= 0.08)
            {
                System.out.print("It is illegal for you to be driving.");
            }
            else if(bac < 0.08)
            {
                System.out.print("It is legal for you to be driving.");
            }

        }
        else if(gender == 2)
        {
            // case Female
            double bac = (oz * 5.14 / weight * 0.66) - 0.015 * hours;
            System.out.print("Your bac is ");
            System.out.printf("%.4f%n",bac);
            if(bac >= 0.08)
            {
                System.out.print("It is illegal for you to be driving.");
            }
            else if(bac < 0.08)
            {
                System.out.print("It is legal for you to be driving.");
            }
        }
    }
}

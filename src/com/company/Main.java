package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter any integer from 1-100: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String high = "Higher";
        String low = "Lower";
        System.out.println("50?");
        int aI = 50;
        while (aI != number)
        {
            String statement = input.nextLine();
            aI = 0;
            if(statement.equals(high))
            {
                aI = aI + 1;
                System.out.println(aI + '?');
            }
            if(statement.equals(low))
            {
                aI = aI -1;
                System.out.println(aI + '?');
            }
        }
        System.out.println("Your number is "+number);
    }
}

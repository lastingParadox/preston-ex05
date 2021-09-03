/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 5
 *  Copyright 2021 Zander Preston
 */

package exercises;

/*
 Write an application
    Prompt the user to input the first number.
        Store first number in integer 'firstNumber'.
        If the user inputs nothing:
            Prompt the user to input a number.
            Store input in 'firstNumber'.
    Prompt the user to input the second number.
        Store second number in integer 'secondNumber'.
        If the user inputs nothing:
            See above, in regard to 'secondNumber'.
    Calculate addition, subtraction, multiplication, and division of 'firstNumber' and 'secondNumber'
        Use separate variables 'sum', 'difference', 'product', and 'quotient' to equal the respective values
    Print all the operations, using a new line for each operation.
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        float firstNumber = input.nextFloat();

        System.out.print("What is the second number? ");
        float secondNumber = input.nextInt();

        float sum = firstNumber + secondNumber;
        float difference = firstNumber - secondNumber;
        float product = firstNumber * secondNumber;
        float quotient = firstNumber / secondNumber;

        System.out.printf("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.2f\n%.2f / %.2f = %.2f",
                          firstNumber, secondNumber, sum, firstNumber, secondNumber, difference, firstNumber,
                          secondNumber, product, firstNumber, secondNumber, quotient);
    }
}

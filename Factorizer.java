package Array;

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the user

        System.out.print("What number would you like to factor? ");
        int number = scanner.nextInt();  // Read the user's input as an integer

        System.out.println("The factors of " + number + " are:");
        int sum = 0;  // Initialize a variable to store the sum of factors
        int count = 0;  // Initialize a variable to store the count of factors
        for (int i = 1; i < number; i++) { // Iterate through numbers from 1 to (number - 1) to find factors
            if (number % i == 0) {  // Check if 'i' is a factor of 'number'
                System.out.print(i + " ");  // Output the factor
                sum += i;  // Add the factor to the sum
                count++;  // Increment the count of factors
            }
        }

        System.out.println(number);  // Output the number itself as a factor
        sum += number;  // Add the number itself to the sum of factors
        count++;  // Increment the count to include the number itself

        System.out.println("\n" + number + " has " + count + " factors.");  // Output the count of factors

        if (sum - number == number) {  // Check if the sum of factors (excluding the number) equals the number
            System.out.println(number + " is a perfect number.");  // Output if the number is perfect
        } else {
            System.out.println(number + " is not a perfect number.");  // Output if the number is not perfect
        }

        if (count == 2) {  // Check if the count of factors is 2 (prime numbers have exactly 2 factors)
            System.out.println(number + " is a prime number.");  // Output if the number is prime
        } else {
            System.out.println(number + " is not a prime number.");  // Output if the number is not prime
        }
    }
}
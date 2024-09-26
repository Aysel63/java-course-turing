package az.edu.turing.modul01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomBoundedInt = random.nextInt(101);
        int[] array = new int[100];
        int count = 0;

        System.out.println("Let the game begin!");
        while (true) {
            System.out.println("Enter a number:");
            int number= scanner.nextInt();
            array[count] =number;
            count++;

            if (number < randomBoundedInt) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (number > randomBoundedInt) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations, you guessed the number!");


                int[] resultArray = Arrays.copyOf(array, count);
                Arrays.sort(resultArray);
                printNumbers(resultArray);
                break;
            }
        }
    }

    public static void printNumbers(int[] numbers) {
        System.out.println("Your numbers: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}



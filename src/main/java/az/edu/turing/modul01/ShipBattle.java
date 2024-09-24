package az.edu.turing.modul01;

import java.util.Random;
import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = 5;
        char[][] field = new char[size][size];
        initializeField(field,'-');
        int targetX = random.nextInt(size);
        int targetY = random.nextInt(size);
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            int x = getValidCoordinate(scanner, "x", size) - 1;
            int y = getValidCoordinate(scanner, "y", size) - 1;
            if (field[x][y] == '*') {
                System.out.println("You have already shot at this point. Try again.");
                continue;
            }
            if (x == targetX && y == targetY) {
                field[x][y] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            } else {
                field[x][y] = '*';
                printField(field);
                System.out.println("Missed.Try again.");
            }
        }


    }
    public static void initializeField(char[][] field,char initialChar){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j]=initialChar;

            }

        }
    }

    public static int getValidCoordinate(Scanner scanner, String coordinateName, int size) {
        int coordinate = 0;
        while (true) {
            System.out.print("Enter the " + coordinateName + " coordinate to shoot (1-" + size + "): ");
            if (scanner.hasNextInt()) {
                coordinate = scanner.nextInt();
                if (coordinate >= 1 && coordinate <= size) {
                    break;
                } else {
                    System.out.println("Error: Coordinate must be between 1 and " + size + ".");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.next();
            }
        }
        return coordinate;
    }

    public static void printField(char[][] field) {
        System.out.println("Game field:");
        System.out.print("  ");
        for(int column=0;column<field[0].length;column++){
            System.out.print(column + " ");}
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}


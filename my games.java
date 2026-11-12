import java.util.Scanner;
import java.util.Random;

public class TreasureHunter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int points = 0;
        int rounds = 5;

        System.out.println("TREASURE HUNTER: MYSTERY ISLAND");
        System.out.println("================================");

        System.out.println("Welcome, brave explorer!");
        System.out.println("Find treasures and avoid traps.");
        System.out.println("You have 5 rounds to explore.");

        while (rounds > 0) {

            System.out.println("\nChoose a location:");
            System.out.println("1. Dark Forest");
            System.out.println("2. Hidden Cave");
            System.out.println("3. Secret Beach");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid location!");
                continue;
            }

            int event = random.nextInt(3) + 1;

            switch (event) {
                case 1:
                    System.out.println("You found a golden treasure!");
                    points += 20;
                    break;

                case 2:
                    System.out.println("You found a small treasure!");
                    points += 10;
                    break;

                case 3:
                    System.out.println("Oh no! You found a trap!");
                    points -= 5;
                    break;
            }

            System.out.println("Current Points: " + points);

            rounds--;
            System.out.println("Remaining Locations: " + rounds);
        }

        System.out.println("\nGAME FINISHED!");
        System.out.println("Your Final Score: " + points);

        if (points >= 70) {
            System.out.println("Rank: MASTER TREASURE HUNTER!");
        } else if (points >= 40) {
            System.out.println("Rank: SKILLED EXPLORER!");
        } else {
            System.out.println("Rank: BEGINNER EXPLORER!");
        }

        System.out.println("Thank you for playing!");

        input.close();
    }
}
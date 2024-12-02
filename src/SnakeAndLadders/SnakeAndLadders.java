package SnakeAndLadders;

import java.util.Random;

public class SnakeAndLadders {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator.");
        Random random = new Random();
        int position = 0;
        int roll = 0;

        while (position < 100) {
            roll++;
            int rollDie = random.nextInt(6) + 1;
            int option = random.nextInt(3) + 1;

            switch (option) {
                case 1:
                    System.out.println("Option: No Play. The player stays at position : " + position);
                    break;
                case 2:
                    if (position + rollDie <= 100) { // Ensure player does not exceed 100
                        position += rollDie;
                        System.out.println("Option: Ladder! The player moves ahead to position " + position);
                    } else {
                        System.out.println("Option: Ladder! But you can't move beyond 100. Stay at " + position);
                    }
                    break;
                case 3:
                    position -= rollDie;
                    if (position < 0) {
                        position = 0;
                    }

                    System.out.println("Option: Snake! The player moves back to position " + position);
                    break;
                default:
                    System.out.println("Invalid..!");
            }
        }
        System.out.println("\nCongratulations! The player reached position 100 in " + roll + " rolls.");
    }
}

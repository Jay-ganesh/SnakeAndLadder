package SnakeAndLadders;

import java.util.Random;

public class SnakeAndLadders {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator.");

        int playerPosition1 = 0;
        int playerPosition2 = 0;

        int playerRolls1 = 0;
        int playerRolls2 = 0;

        boolean player1Turn = true;

        while (playerPosition1 < 100 && playerPosition2 < 100) {
            if (player1Turn) {
                playerRolls1++;
                System.out.println("\nPlayer 1 - Roll " + playerRolls1 + ":");
                playerPosition1 = playTurn(playerPosition1);
                if (playerRolls1 < 100) {
                    player1Turn = false;  // Switch to Player 2
                }
            } else {
                playerRolls2++;
                System.out.println("\nPlayer 2 - Roll " + playerRolls2 + ":");
                playerPosition2 = playTurn(playerPosition2);
                if (playerPosition2 < 100) {
                    player1Turn = true;  // Switch to Player 1
                }
            }
        }
        if (playerPosition1 == 100) {
            System.out.println("\nCongratulations Player 1! Reached 100 in " + playerRolls1 + " rolls.");
        } else {
            System.out.println("\nCongratulations Player 2! Reached 100 in " + playerRolls2 + " rolls.");
        }
    }

    public static int playTurn(int position) {
        Random random = new Random();

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
        System.out.println("Current Position : "+position);
        return position;
    }
}

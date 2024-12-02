package SnakeAndLadders;

import java.util.Random;

public class SnakeAndLadders {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator.");
        Random random = new Random();
        int position = 0;
        int rollDie = random.nextInt(6)+1;
        System.out.println("Player is at position : "+position);
        System.out.println("Player rolled : "+rollDie);
    }
}

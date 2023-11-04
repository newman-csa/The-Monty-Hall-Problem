import java.util.Scanner;

public class Main {
    public static void greetingMessage() {
        System.out.println("Welcome to the Monty Hall Game!");
        System.out.println("\nThere are two goats and a car randomly placed behind doors 1, 2 and 3");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        greetingMessage();
        System.out.print("Where do you think the car is? Enter 1, 2 or 3: ");
        MontyHall game = new MontyHall(scn.nextInt());
        game.hasGoatMessage();

        System.out.print("Do you want to switch your guess? Yes or No: ");
        if (scn.next().equals("Yes")) {
            game.playerSwitchDoor();
        }

        game.winLostMessage();
    }
}
enum Door {
    DOOR1,
    DOOR2,
    DOOR3
}

public class MontyHall {
    private final Door CAR_DOOR = Door.values()[(int) (Math.random() * 3)];
    private Door goatDoor;
    private Door playerDoor;

    public MontyHall(int num) {
        if (num == 1) {
            playerDoor = Door.DOOR1;
        } else if (num == 2) { // * Else-if statement
            playerDoor = Door.DOOR2;
        } else {
            playerDoor = Door.DOOR3;
        }

        // Previously Switch statement but I had to meet assignment requirements
        /*switch (num) {
            case 1:
                playerDoor = Door.DOOR1;
                break;
            case 2:
                playerDoor = Door.DOOR2;
                break;
            case 3:
                playerDoor = Door.DOOR3;
                break;
            default:
                break;
        } 
        */
    }

    public void hasGoatMessage() {
        while (true) {
            goatDoor = Door.values()[(int) (Math.random() * 3)];
            if (goatDoor != playerDoor && goatDoor != CAR_DOOR) { // * Compound Boolean Statement
                System.out.println("One of the goats is behind door number " + (goatDoor.ordinal() + 1));
                break;
            }
        }
    }

    public void playerSwitchDoor() {
        for (Door door : Door.values()) {
            if (door != playerDoor && door != goatDoor) {
                System.out.println("Guess switched from " + (playerDoor.ordinal() + 1)
                        + " to " + (door.ordinal() + 1) + ".");
                playerDoor = door;
                break;
            }
        }
    }

    public void winLostMessage() {
        if (playerDoor == CAR_DOOR) {
            System.out.println("You won the car!");
        } else { // * If-else statement
            System.out.println("The car is behind door " + (CAR_DOOR.ordinal() + 1)
                    + ". You lost! (Or you could say you won the goat!)");
        }
    }
}

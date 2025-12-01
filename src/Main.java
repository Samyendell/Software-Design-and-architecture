import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        int redPlayerPosition = 0;
        int bluePlayerPosition = 0;
        int redRolls = 0;   // count of times red rolled
        int blueRolls = 0;  // count of times blue rolled

        while (redPlayerPosition < 21 && bluePlayerPosition < 21) {
            // Red player's turn
            int diceRollOne = random.nextInt(6) + 1;
            int diceRollTwo = random.nextInt(6) + 1;
            int totalRoll = diceRollOne + diceRollTwo;
            redPlayerPosition += totalRoll;
            redRolls++;  // increment red's roll count
            System.out.println("Red player rolled " + diceRollOne + " and " + diceRollTwo + " for a total of " + totalRoll + ". New position: " + redPlayerPosition);

            if (redPlayerPosition >= 21) {
                System.out.println("Red player wins! They rolled " + redRolls + " times.");
                break;
            }

            // Blue player's turn
            diceRollOne = random.nextInt(6) + 1;
            diceRollTwo = random.nextInt(6) + 1;
            totalRoll = diceRollOne + diceRollTwo;
            bluePlayerPosition += totalRoll;
            blueRolls++;  // increment blue's roll count
            System.out.println("Blue player rolled " + diceRollOne + " and " + diceRollTwo + " for a total of " + totalRoll + ". New position: " + bluePlayerPosition);

            if (bluePlayerPosition >= 21) {
                System.out.println("Blue player wins! They rolled " + blueRolls + " times.");
                break;
            }
        }


        // roll dice 2x 6-sided dice

        //move player who rolled
        // record position 
        // print out new position
        // repeat for other player
        // check if they've moved past or on position 21, stop game that player wins
        // log stuff out
    }
}
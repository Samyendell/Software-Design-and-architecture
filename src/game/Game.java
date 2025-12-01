package game;

import game.dice.Dice;
import game.logging.Logger;
import game.player.Player;
import game.util.TurnCounter;

public class Game {
    private final Player red;
    private final Player blue;
    private final Dice dice;
    private final Logger logger;
    private final TurnCounter turnCounter = new TurnCounter();

    public Game(Player red, Player blue, Dice dice, Logger logger) {
        this.red = red;
        this.blue = blue;
        this.dice = dice;
        this.logger = logger;
    }

    public void start() {
        logger.log("Game started!");

        while (true) {
            turnCounter.nextTurn();

            Player current = turnCounter.isEvenTurn() ? blue : red;

            int roll = dice.roll();
            current.move(roll);

            logger.log(
                    "Turn " + turnCounter.getTurn() + ": " +
                            current.getName() + " rolled " + roll +
                            " → position: " + current.getPosition()
            );

            if (current.hasWon()) {
                logger.log(current.getName() + " wins!");
                logger.log(current.getName() + " rolled " +
                        current.getRollCount() + " times.");
                break;
            }
        }
    }
}

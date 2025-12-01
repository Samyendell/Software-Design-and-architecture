package game.dice;

import java.util.Random;

public class TwoSixSidedDice implements Dice {
    private final Random random = new Random();

    @Override
    public int roll() {
        int d1 = random.nextInt(6) + 1;
        int d2 = random.nextInt(6) + 1;
        return d1 + d2;
    }
}
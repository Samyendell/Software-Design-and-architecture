package game.util;

public class TurnCounter {
    private int turn = 0;

    public void nextTurn() {
        turn++;
    }

    public int getTurn() {
        return turn;
    }

    public boolean isEvenTurn() {
        return turn % 2 == 0;
    }
}

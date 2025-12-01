package game.player;

public interface Player {
    void move(int spaces);
    boolean hasWon();
    int getPosition();
    String getName();
    int getRollCount();
}

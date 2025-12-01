package game.player;

public class DefaultPlayer implements Player {
    private final String name;
    private int position = 0;
    private int rollCount = 0;

    public DefaultPlayer(String name) {
        this.name = name;
    }

    @Override
    public void move(int spaces) {
        position += spaces;
        rollCount++;
    }

    @Override
    public boolean hasWon() {
        return position >= 21;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRollCount() {
        return rollCount;
    }
}

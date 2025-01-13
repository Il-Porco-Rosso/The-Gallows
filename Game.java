public class Game {
    private int wrongs = 0;
    public static int rounds = 0;
    public static int dudeshanged = 0;
    private int turnspassed = 0;

    public Game() {
        Game.rounds++;
    }

    public int getWrongs() {
        return this.wrongs;
    }

    public int getTurnsPassed() {
        return this.turnspassed;
    }
}

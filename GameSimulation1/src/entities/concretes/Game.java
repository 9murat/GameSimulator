package entities.concretes;

public class Game {
    private String gameName;
    private double gamePrice;

    public Game() {
    }

    public Game(String gameName, double gamePrice) {
        this.setGameName(gameName);
        this.setGamePrice(gamePrice);
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }


    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
}

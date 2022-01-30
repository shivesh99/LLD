package lowLevelDesign.TicTacToe;

public class Player {
    private String player;
    private int playerId;
    private  String address;
    private int ranking;
    private char playerSymbol;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public char getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(char playerSymbol) {
        this.playerSymbol = playerSymbol;
    }
}

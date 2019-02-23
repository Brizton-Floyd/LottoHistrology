package model.lottogamemodels;

public abstract class LotteryGame {

    protected String gameName;
    protected int gameId, minNumber, maxNumber;
    protected int numberOfDrawPositions;
    protected DrawResult drawResult;

    public LotteryGame(){}

    public LotteryGame(String gameName, int id, int numberOfDrawPositions, int minNumber, int maxNumber) {
        this.gameName = gameName;
        this.numberOfDrawPositions = numberOfDrawPositions;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.gameId = id;
    }

    public String getGameName() {
        return gameName;
    }

    public DrawResult getDrawResult() {
        if(drawResult == null)
            drawResult = new DrawResult();
        return drawResult;
    }
}

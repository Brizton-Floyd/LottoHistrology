package model.lottogamemodels;

public class FivePositionLotteryGame extends LotteryGame {

    public  FivePositionLotteryGame(String gameName){
        this(gameName,1,1,40);
    }
    public FivePositionLotteryGame(String gameName, int id, int minNumber, int maxNumber){
        super(gameName, id,5,minNumber,maxNumber);
    }
}

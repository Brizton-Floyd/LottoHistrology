package model.lottogamemodels;

public class FivePositionLotteryGame extends LotteryGame {

    public FivePositionLotteryGame(String gameName, int id, int minNumber, int maxNumber){
        super(gameName, id,5,minNumber,maxNumber);
    }
}

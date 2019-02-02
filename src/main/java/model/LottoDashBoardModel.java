package model;

import model.lottogamemodels.LotteryGame;

public class LottoDashBoardModel extends ModelBase{

    private LotteryGame lotteryGame;

    public LottoDashBoardModel(LotteryGame lotteryGame) {
        this.lotteryGame = lotteryGame;
    }

    public LotteryGame getLotteryGame() {
        return lotteryGame;
    }
}

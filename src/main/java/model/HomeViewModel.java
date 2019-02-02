package model;

import model.lottogamemodels.LotteryGame;

public class HomeViewModel extends ModelBase{
    private LotteryGame lotteryGame;

    public HomeViewModel(LotteryGame lotteryGame){
        this.lotteryGame = lotteryGame;
    }

    public LotteryGame getLotteryGame() {
        return lotteryGame;
    }
}

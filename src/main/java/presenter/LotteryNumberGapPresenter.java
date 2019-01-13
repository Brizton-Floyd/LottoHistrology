package presenter;

import model.LotteryNumberGapModel;
import ui.LotteryNumberGapView;

public class LotteryNumberGapPresenter extends BasePresenter<LotteryNumberGapView, LotteryNumberGapModel> {

    LotteryNumberGapPresenter(){
        super(new LotteryNumberGapView(), new LotteryNumberGapModel());
    }
    @Override
    public void onModelChanged(String value) {

    }
}

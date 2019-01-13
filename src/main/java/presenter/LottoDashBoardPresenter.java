package presenter;

import model.LottoDashBoardModel;
import ui.LottoDashBoardView;

public class LottoDashBoardPresenter extends BasePresenter<LottoDashBoardView, LottoDashBoardModel> {

    LottoDashBoardPresenter() {
        super(new LottoDashBoardView(), new LottoDashBoardModel());
    }

    @Override
    public void onModelChanged(String value) {

    }

}

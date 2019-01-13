package presenter;

import model.BetSlipModel;
import ui.BetSlipView;

public class BetSlipPresenter extends BasePresenter<BetSlipView, BetSlipModel> {

    public BetSlipPresenter(){
        super(new BetSlipView(), new BetSlipModel());
    }
    @Override
    public void onModelChanged(String value) {

    }
}

package presenter;

import constants.EventSource;
import model.HomeViewModel;
import ui.HomeView;

@SuppressWarnings("unchecked")
public class HomePresenter extends BasePresenter<HomeView, HomeViewModel> implements ViewEvent {

    public HomePresenter(){
        super(new HomeView(),new HomeViewModel());
        getView().setPresenter((this));
        getView().setUpUi();
    }

    @Override
    public void onModelChanged(String value) {

    }

    @Override
    public void handleViewEvent(EventSource source) {
        switch (source){
            case GAME_PANEL:
                break;
            case LOTTO_DASHBOARD:
                
                break;
            case COMPANION_NUMBER:
                break;
            case BET_SLIP_ANALYSIS:
                break;
            case GAME_OUT_ANALYSIS:
                break;
            case Lottery_Number_Gaps:
                break;
            case POSITION_HIT_SEQUENCE:
                break;
            case MULTiPLE:
                break;
        }
    }
}

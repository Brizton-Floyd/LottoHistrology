package presenter;

import constants.EventSource;
import javafx.stage.Stage;
import model.HomeViewModel;
import ui.HomeView;

@SuppressWarnings("unchecked")
public class HomePresenter extends BasePresenter<HomeView, HomeViewModel> implements ViewEvent {

    private Stage primaryStage;

    public HomePresenter(Stage primaryStage){
        super(new HomeView(),new HomeViewModel());
        this.primaryStage = primaryStage;

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
                launchGameOutPanel();
                break;
            case LOTTO_DASHBOARD:
                injectLottoDashBoardView();
                break;
            case COMPANION_NUMBER:
                injectCompanionNumberView();
                break;
            case BET_SLIP_ANALYSIS:
                injectBetSlipView();
                break;
            case GAME_OUT_ANALYSIS:
                injectGameOutView();
                break;
            case LOTTERY_NUMBER_GAPS:
                injectLotteryNumberGapView();
                break;
            case POSITION_HIT_SEQUENCE:
                injectPositionSequenceView();
                break;
            case MULTiPLE:
                injectMultipleView();
                break;
        }
    }

    private void launchGameOutPanel() {
        GamePanelPresenter gamePanelPresenter = new GamePanelPresenter(primaryStage, (this) );
    }

    private void injectMultipleView() {
        MultiplePresenter multiplePresenter = new MultiplePresenter();
        getView().injectView( multiplePresenter.getView() );
    }

    private void injectPositionSequenceView() {
        PositionSequencePresenter positionSequencePresenter = new PositionSequencePresenter();
        getView().injectView( positionSequencePresenter.getView() );
    }

    private void injectLotteryNumberGapView() {
        LotteryNumberGapPresenter lotteryNumberGapPresenter = new LotteryNumberGapPresenter();
        getView().injectView( lotteryNumberGapPresenter.getView() );
    }

    private void injectGameOutView() {
        GameOutPresenter gameOutPresenter = new GameOutPresenter();
        getView().injectView( gameOutPresenter.getView() );
    }

    private void injectBetSlipView() {
        BetSlipPresenter betSlipPresenter = new BetSlipPresenter();
        getView().injectView( betSlipPresenter.getView() );
    }

    private void injectCompanionNumberView() {
        CompanionNumberPresenter companionNumberPresenter = new CompanionNumberPresenter();
        getView().injectView( companionNumberPresenter.getView() );
    }

    private void injectLottoDashBoardView() {
        LottoDashBoardPresenter lottoDashBoardPresenter = new LottoDashBoardPresenter();
        getView().injectView( lottoDashBoardPresenter.getView() );
    }

    void disableViewContents() {
        getView().disableViewContents();
    }

    void enableViewContents() {
        getView().enableViewContents();
    }
}

package presenter;

import model.LottoDashBoardModel;
import model.lottogamemodels.DrawResult;
import model.lottogamemodels.LotteryGame;
import services.dashboardservice.LottoDashboardService;
import services.cacheservice.CacheManager;
import services.cacheservice.CachedObject;
import ui.LottoDashBoardView;

public class LottoDashBoardPresenter extends BasePresenter<LottoDashBoardView, LottoDashBoardModel> {

    LottoDashBoardPresenter(LotteryGame lotteryGame) {
        super(new LottoDashBoardView(), new LottoDashBoardModel(lotteryGame));
        getView().setUpUi();
        populateDashboardView();
    }

    @Override
    public void onModelChanged(String value) {

    }

    private void populateDashboardView() {

        final CachedObject cachedObject = (CachedObject) CacheManager.getObjectFromCache( getModel().getLotteryGame().getGameName() );
        LotteryGame lotteryGame = (LotteryGame) cachedObject.getObject();

        if(lotteryGame.getDrawResult() == null) {
            LottoDashboardService lottoDashboardService = new LottoDashboardService(lotteryGame.getGameName());
            final DrawResult drawResult = lottoDashboardService.getDrawResults();
        }

    }

}

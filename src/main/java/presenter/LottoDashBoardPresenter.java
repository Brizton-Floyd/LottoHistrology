package presenter;

import model.LottoDashBoardModel;
import model.lottogamemodels.DrawResult;
import model.lottogamemodels.FivePositionLotteryGame;
import model.lottogamemodels.LotteryGame;
import services.dashboardservice.LottoDashboardService;
import services.cacheservice.CacheManager;
import services.cacheservice.CachedObject;
import ui.LottoDashBoardView;

import java.util.List;

public class LottoDashBoardPresenter extends BasePresenter<LottoDashBoardView, LottoDashBoardModel> {


    LottoDashBoardPresenter(LotteryGame lotteryGame) {
        super(new LottoDashBoardView(), new LottoDashBoardModel(lotteryGame));
        getView().setUpUi();
        populateDashboardView();
    }

    LottoDashBoardPresenter(String gameName) {
        CacheManager.emptyMap();
        LotteryGame lotteryGame = new FivePositionLotteryGame(gameName);
        setModel(new LottoDashBoardModel(lotteryGame));
        setView(new LottoDashBoardView());
        getView().setUpUi();

        CachedObject obj = new CachedObject(getModel().getLotteryGame(), getModel().getLotteryGame().getGameName());
        CacheManager.insertIntoCache(obj);
        populateDashboardView();
    }

    @Override
    public void onModelChanged(String value) {

    }

    private void populateDashboardView() {

        final CachedObject cachedObject = (CachedObject) CacheManager.getObjectFromCache( getModel().getLotteryGame().getGameName() );
        LotteryGame lotteryGame = (LotteryGame) cachedObject.getObject();

        if(lotteryGame.getDrawResult().getResults().size() == 0) {
            LottoDashboardService lottoDashboardService = new LottoDashboardService(lotteryGame.getGameName());
            final List<DrawResult> drawResults = lottoDashboardService.getDrawResults();
            getModel().getLotteryGame().getDrawResult().setDrawResults( drawResults );

        }

    }

}

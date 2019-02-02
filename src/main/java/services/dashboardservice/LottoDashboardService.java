package services.dashboardservice;

import model.lottogamemodels.DrawResult;
import model.lottogamemodels.LotteryGame;

public class LottoDashboardService {

    private LottoDashboardRepository lottoDashboardRepository;

    public LottoDashboardService(String lotteryGame){
        this.lottoDashboardRepository = new LottoDashboardRepository( lotteryGame );
    }

    public DrawResult getDrawResults() {
        return lottoDashboardRepository.getDrawResults();
    }
}

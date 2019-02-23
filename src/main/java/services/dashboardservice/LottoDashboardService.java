package services.dashboardservice;

import model.lottogamemodels.DrawResult;
import model.lottogamemodels.LotteryGame;

import java.util.List;

public class LottoDashboardService {

    private LottoDashboardRepository lottoDashboardRepository;

    public LottoDashboardService(String lotteryGame){
        this.lottoDashboardRepository = new LottoDashboardRepository( lotteryGame );
    }

    public List<DrawResult> getDrawResults() {
        return lottoDashboardRepository.getDrawResults();
    }
}

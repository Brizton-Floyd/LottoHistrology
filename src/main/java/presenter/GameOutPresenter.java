package presenter;

import model.GameOutModel;
import ui.GameOutView;

public class GameOutPresenter extends BasePresenter<GameOutView, GameOutModel> {

    GameOutPresenter(){
        super(new GameOutView(), new GameOutModel());
    }
    @Override
    public void onModelChanged(String value) {

    }
}

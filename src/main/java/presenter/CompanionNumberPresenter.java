package presenter;

import model.CompanionNumberModel;
import ui.CompanionNumberView;

public class CompanionNumberPresenter extends BasePresenter<CompanionNumberView, CompanionNumberModel>{

    CompanionNumberPresenter(){
        super(new CompanionNumberView(), new CompanionNumberModel());
    }

    @Override
    public void onModelChanged(String value) {

    }
}

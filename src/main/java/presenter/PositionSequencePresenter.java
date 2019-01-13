package presenter;

import model.PositionSequenceModel;
import ui.PositionSequenceView;

public class PositionSequencePresenter extends BasePresenter<PositionSequenceView, PositionSequenceModel> {

    PositionSequencePresenter(){
        super(new PositionSequenceView(), new PositionSequenceModel());
    }
    @Override
    public void onModelChanged(String value) {

    }
}

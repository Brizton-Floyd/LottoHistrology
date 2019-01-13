package presenter;

import model.MultipleModel;
import ui.MultipleView;

public class MultiplePresenter extends BasePresenter<MultipleView, MultipleModel> {

    MultiplePresenter(){
        super(new MultipleView(), new MultipleModel());
    }
    @Override
    public void onModelChanged(String value) {

    }
}

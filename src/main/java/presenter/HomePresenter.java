package presenter;

import model.HomeViewModel;
import ui.HomeView;

@SuppressWarnings("unchecked")
public class HomePresenter extends BasePresenter<HomeView, HomeViewModel> {

    public HomePresenter(){
        super(new HomeView(),new HomeViewModel());
        getView().setPresenter((this));
    }

    @Override
    public void onModelChanged(String value) {

    }
}

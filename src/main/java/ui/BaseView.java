package ui;

import javafx.scene.layout.AnchorPane;
import presenter.BasePresenter;

public abstract class BaseView<P extends BasePresenter> extends AnchorPane {

    private P presenter;

    protected P getPresenter() {
        return presenter;
    }

    public void setPresenter(P presenter) {
        this.presenter = presenter;
    }

    public abstract void setUpUi();

}

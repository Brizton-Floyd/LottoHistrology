package presenter;

import model.IModelChangedListener;
import model.ModelBase;
import ui.BaseView;

public abstract class BasePresenter<V extends BaseView, M extends ModelBase> implements IModelChangedListener {

    private V view;
    private M model;

    public BasePresenter(V view, M model) {
        this.view = view;
        this.model = model;
        model.addModelChangedListener((this));
    }

    protected void setModel(M model) {
        this.model = model;
    }

    public V getView() {
        return view;
    }

    protected M getModel() {
        return model;
    }

}
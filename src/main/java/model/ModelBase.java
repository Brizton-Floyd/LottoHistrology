package model;

import java.util.*;

public abstract class ModelBase {

    private List<IModelChangedListener> listeners = new LinkedList<>();

    public void addModelChangedListener(IModelChangedListener listener) {
        listeners.add(listener);
    }

    public void removeModelChangedListener(IModelChangedListener listener) {
        listeners.remove(listener);
    }

    protected void onModelChanged(String variable) {
        listeners.stream().forEach((listener) -> listener.onModelChanged(variable));
    }

}
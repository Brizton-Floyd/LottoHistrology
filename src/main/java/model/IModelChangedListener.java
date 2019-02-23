package model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public interface IModelChangedListener {

    <T extends String > void onModelChanged(T value);
}

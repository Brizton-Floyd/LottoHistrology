package presenter;

import constants.EventSource;

public interface ViewEvent {
    void handleViewEvent(EventSource source);
}

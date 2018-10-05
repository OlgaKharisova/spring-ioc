package ru.innopolis.stc13.patterns.behavioral.observer.subscriber;

import ru.innopolis.stc13.patterns.behavioral.observer.model.Event;

public interface Subscriber {

    void handleMessage(Event event);
}

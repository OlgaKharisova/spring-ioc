package ru.innopolis.stc13.patterns.behavioral.observer.publisher;

import ru.innopolis.stc13.patterns.behavioral.observer.subscriber.Subscriber;
import ru.innopolis.stc13.patterns.behavioral.observer.model.Event;

public interface Publisher {

    void addSubscriber(Subscriber sub);

    void removeSubscriber(Subscriber sub);

    void notifySubscribers(Event event);
}

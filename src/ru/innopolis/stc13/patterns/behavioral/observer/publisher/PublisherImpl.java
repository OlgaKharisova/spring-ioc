package ru.innopolis.stc13.patterns.behavioral.observer.publisher;

import ru.innopolis.stc13.patterns.behavioral.observer.subscriber.Subscriber;
import ru.innopolis.stc13.patterns.behavioral.observer.model.Event;

import java.util.HashSet;
import java.util.Set;

public class PublisherImpl implements Publisher {

    private Set<Subscriber> subscribers;

    public PublisherImpl() {
        subscribers = new HashSet<>();
    }

    @Override
    public void addSubscriber(Subscriber sub) {
        subscribers.add(sub);
    }

    @Override
    public void removeSubscriber(Subscriber sub) {
        subscribers.remove(sub);
    }

    @Override
    public void notifySubscribers(Event event) {
        subscribers.forEach(s -> s.handleMessage(event));
    }
}

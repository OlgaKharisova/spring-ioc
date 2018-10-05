package ru.innopolis.stc13.patterns.behavioral.observer;

import ru.innopolis.stc13.patterns.behavioral.observer.model.Event;
import ru.innopolis.stc13.patterns.behavioral.observer.publisher.Publisher;
import ru.innopolis.stc13.patterns.behavioral.observer.publisher.PublisherImpl;
import ru.innopolis.stc13.patterns.behavioral.observer.subscriber.Subscriber;
import ru.innopolis.stc13.patterns.behavioral.observer.subscriber.SubscriberImpl;

public class ObserverDemo {

    public static void main(String[] args) {
        Publisher pub = new PublisherImpl();
        Subscriber vova = new SubscriberImpl("junior Vova");
        Subscriber pasha = new SubscriberImpl("junior Pasha");
        pub.addSubscriber(new SubscriberImpl("junior Vasya"));
        pub.addSubscriber(new SubscriberImpl("junior Petya"));
        pub.addSubscriber(vova);
        pub.addSubscriber(pasha);
        pub.notifySubscribers(new Event("05.10.18, 13:00", "Stolovaya party"));
        pub.removeSubscriber(vova);
        pub.removeSubscriber(pasha);
        pub.notifySubscribers(new Event("05.10.18, 23:00", "Bar 108"));

    }
}

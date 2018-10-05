package ru.innopolis.stc13.patterns.behavioral.observer.subscriber;

import ru.innopolis.stc13.patterns.behavioral.observer.model.Event;

public class SubscriberImpl implements Subscriber {

    private String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handleMessage(Event event) {
        System.out.println(name + " go to " + event);
    }


}

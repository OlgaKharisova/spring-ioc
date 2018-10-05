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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubscriberImpl that = (SubscriberImpl) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

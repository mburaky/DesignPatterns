package tr.mby.com.behavioral.observer.subject;

import tr.mby.com.behavioral.observer.Observer;

public interface Subject {

    public void addSubscriber(Observer observer);

    public void removeSubscriber(Observer observer);

    public void notifySubscribers(String title, String link);
}

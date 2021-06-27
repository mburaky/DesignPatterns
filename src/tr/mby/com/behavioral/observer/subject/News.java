package tr.mby.com.behavioral.observer.subject;

import tr.mby.com.behavioral.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class News implements Subject {

    protected String title;
    protected String link;
    protected List<Observer> observers = new ArrayList<Observer>();

    public News(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void tweet() {
        System.out.printf("\nTweet with Title: %s, Link: %s\n", title, link);
        notifySubscribers(title, link);
    }

    @Override
    public synchronized void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public synchronized void notifySubscribers(String title, String link) {
        observers.forEach(observer -> observer.notification(title, link));
    }
}

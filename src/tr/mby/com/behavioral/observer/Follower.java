package tr.mby.com.behavioral.observer;

public class Follower implements Observer {

    protected String name;
    public Follower(String name) {
        super();
        this.name = name;
    }

    @Override
    public void notification(String title, String link) {
        System.out.printf("'%s' received notification with Title: '%s', Link: '%s'\n", name, title, link);
    }
}

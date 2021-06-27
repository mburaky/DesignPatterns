package tr.mby.com.behavioral.observer;

import tr.mby.com.behavioral.observer.subject.News;

public class Application {

    public static void main(String[] args) {
        News breakingNews = new News("Covid19 is over!!!", "http://covid19.over");

        Follower racheal = new Follower("Racheal");
        Follower micheal = new Follower("Micheal");

        breakingNews.addSubscriber(racheal);
        breakingNews.addSubscriber(micheal);

        breakingNews.tweet();
    }
}

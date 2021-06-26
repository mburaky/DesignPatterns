package tr.mby.com.structural.decorator;

import tr.mby.com.structural.decorator.notify.Notifier;

public class NotifierDecorator implements Notifier {

    Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage() {
        this.notifier.sendMessage();
    }
}

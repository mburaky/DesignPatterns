package tr.mby.com.structural.decorator;

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

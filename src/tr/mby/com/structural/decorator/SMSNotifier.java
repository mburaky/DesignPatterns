package tr.mby.com.structural.decorator;

public class SMSNotifier extends NotifierDecorator {

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("SMS message is sent");
    }
}

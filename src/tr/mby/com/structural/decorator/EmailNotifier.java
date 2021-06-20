package tr.mby.com.structural.decorator;

public class EmailNotifier extends NotifierDecorator {

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Email message is sent");
    }
}

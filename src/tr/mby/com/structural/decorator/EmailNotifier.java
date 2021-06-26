package tr.mby.com.structural.decorator;

import tr.mby.com.structural.decorator.notify.Notifier;

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

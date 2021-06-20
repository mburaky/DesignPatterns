package tr.mby.com.structural.decorator;

public class Application {

    public static void main(String[] args) {

        Notifier notifier = new PushNotifier();
        notifier = new SMSNotifier(notifier);

        notifier.sendMessage();
        //  === Output ===
        // Push message is sent
        // SMS message is sent

        Notifier notifier2 = new SMSNotifier(new EmailNotifier(new PushNotifier()));
        notifier2.sendMessage();

        //  === Output ===
        // Push message is sent
        // Email message is sent
        // SMS message is sent
    }
}

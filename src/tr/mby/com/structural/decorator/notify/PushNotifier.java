package tr.mby.com.structural.decorator.notify;

public class PushNotifier implements Notifier {

    @Override
    public void sendMessage() {
        System.out.println("Push message is sent");
    }
}

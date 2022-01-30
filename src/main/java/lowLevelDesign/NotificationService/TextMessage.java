package lowLevelDesign.NotificationService;

public class TextMessage extends Notification{

    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is the text message");
    }

    @Override
    void sendMessage() {
        notificationSender.sendNotification();

    }
}

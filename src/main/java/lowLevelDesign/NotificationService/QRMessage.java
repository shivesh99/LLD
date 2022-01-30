package lowLevelDesign.NotificationService;

public class QRMessage extends Notification{
    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is the QR Message");
    }

    @Override
    void sendMessage() {
        notificationSender.sendNotification();

    }
}

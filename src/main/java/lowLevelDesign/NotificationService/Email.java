package lowLevelDesign.NotificationService;

public class Email implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending Email");
    }
}

package lowLevelDesign.NotificationService;

public class SMS implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("sending sms");

    }
}

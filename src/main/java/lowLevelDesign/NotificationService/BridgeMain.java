package lowLevelDesign.NotificationService;

public class BridgeMain {
    public static void main(String[] args) {
        TextMessage textMessage=new TextMessage(new Email());
        textMessage.sendMessage();
        TextMessage textMessage1=new TextMessage(new SMS());
        textMessage1.sendMessage();

        QRMessage qrMessage =new QRMessage(new Email());
        qrMessage.sendMessage();


    }
}

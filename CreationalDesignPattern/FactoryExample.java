package DesignPattern;
 interface NotificationExecutor {
    public void executeNotification();
}
class EmailNotificationExecutor implements NotificationExecutor {

    @Override
    public void executeNotification() {
        System.out.println("Email notification sent");
    }
}
class SMSNotificationExecutor implements NotificationExecutor {

    @Override
    public void executeNotification() {
        System.out.println("SMS notification sent.");
    }
}
class NotificationExecutorFactory {

    public static NotificationExecutor getNotificationExecutor(String executorType) {
        if(executorType.equals("Email"))
            return new EmailNotificationExecutor();
        if(executorType.equals("SMS"))
            return new SMSNotificationExecutor();
        return null;
    }
}
public class FactoryExample {
    public static void main(String[] args) {
        NotificationExecutorFactory.getNotificationExecutor("Email").executeNotification();
    }
}

package coding_test.javatest.notifier;


class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("이메일 발송: " + message);
    }
}

class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS 발송: " + message);
    }
}

public class Notifier {
    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.send("주문이 완료되었습니다.");

        SmsNotification smsNotification = new SmsNotification();
        smsNotification.send("배송이 시작되었습니다.");
    }
}

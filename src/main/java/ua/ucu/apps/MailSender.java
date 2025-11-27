package ua.ucu.apps;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String message = mailInfo.generate();
        System.out.println("Sending email to: " + mailInfo.getClient().getName());
        System.out.println("Message: " + message);
        System.out.println("Email sent successfully!\n");
    }
}
package ua.ucu.apps;


public class GiftMailCode implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Dear %s, we have a special gift for you!", client.getName());
    }
}
package ua.ucu.apps;


public class BirthdayMailCode implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Happy Birthday, %s! Wishing you a wonderful year ahead at age %d!", 
            client.getName(), client.getAge());
    }
}
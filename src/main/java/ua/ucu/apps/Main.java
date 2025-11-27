package ua.ucu.apps;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Testing Builder Pattern ");
        User user = User.builder()
                .age(25)
                .name("John Doe")
                .gender(Gender.MALE)
                .weight(75.5)
                .height(180.0)
                .role("User")
                .role("Admin")
                .role("SuperAdmin")
                .build();
        System.out.println(user);
        
        System.out.println("\nTesting Strategy Pattern (MailBox) ");
        Client client1 = new Client("Alice", 30, "Female");
        Client client2 = new Client("Bob", 25, "Male");
        
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(new MailInfo(client1, new BirthdayMailCode()));
        mailBox.addMailInfo(new MailInfo(client2, new GiftMailCode()));
        mailBox.sendAll();
        
        System.out.println("\nTesting Proxy Pattern (Lazy Image Loading)");
        MyImage image = new ProxyImage("test_image.jpg");
        System.out.println("Image object created, but not loaded yet.");
        
        System.out.println("\nNow calling display() for the first time:");
        image.display();
        
        System.out.println("\nCalling display() again:");
        image.display();
    }
}
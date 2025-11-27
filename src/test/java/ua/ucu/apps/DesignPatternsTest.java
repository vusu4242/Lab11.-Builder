package ua.ucu.apps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


class DesignPatternsTest {
    
    @Test
    void testBuilderPattern() {
        User user = User.builder()
                .name("Test User")
                .age(30)
                .gender(Gender.MALE)
                .build();
        
        assertEquals("Test User", user.getName());
        assertEquals(30, user.getAge());
        assertEquals(Gender.MALE, user.getGender());
    }
    
    @Test
    void testStrategyPattern() {
        Client client = new Client("Alice", 25, "Female");
        MailCode birthdayCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, birthdayCode);
        
        String message = mailInfo.generate();
        assertTrue(message.contains("Alice"));
        assertTrue(message.contains("Birthday"));
    }
    
    @Test
    void testClientIdIncrement() {
        Client c1 = new Client();
        Client c2 = new Client();
        assertEquals(c1.getId() + 1, c2.getId());
    }
}
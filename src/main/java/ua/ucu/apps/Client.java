package ua.ucu.apps;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Client {
    private static int counter = 0;
    private int id;
    private String name;
    private int age;
    private String sex;
    
    public Client(String name, int age, String sex) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    public Client() {
        this.id = counter++;
    }
}


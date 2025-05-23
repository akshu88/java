package tutorial41;

public class USER {
    String username;
    String email;
    int age;


    USER(){
        this.username = "GUEST";
        this.email = "not provided";
        this.age = 0;
    }

    USER(String username) {
        this.username = username;
        this.email = "not provided";
        this.age = 0;
    }
    USER(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    USER(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

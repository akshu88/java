package tutorial41;

public class con1 {
    public static void main(String[] args) {
        // overload constructors = Allow a class to have mutilple constructors
        //                         with different parameter lists.
        //                         Enables object to be initialized in various ways.

        USER user1 = new USER("John");
        USER user2 = new USER("Jane", "jane@example.com");
        USER user3 = new USER("Doe", "doe@example.com", 25);
        USER user4 = new USER(); // default constructor


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}

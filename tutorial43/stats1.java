package tutorial43;

public class stats1 {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        //            rather than to any specific object.
        //            Commonly used for utility methods or shared resoures.
        
        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Sofia");
        Friend friend3 = new Friend("Akshita");
        Friend friend4 = new Friend("Colleen");
        Friend friend5 = new Friend("Saket");

        
        Friend.showFriends();
        //System.out.println(Friend.numOfFriends);
        //System.out.println(friend2.numOfFriends);
        //System.out.println(friend3.numOfFriends);
        //System.out.println(friend1.name);

    }
}

package Day13;
//необходимо создать свою небольшую социальную сеть на Java
public class Main {
    public static void main (String[] arg){
        User u1 = new User("User1");
        User u2 = new User("User2");
        User u3 = new User("User3");

        u1.subscribe(u2);
        u2.subscribe(u1);

        u2.subscribe(u3);

        u3.subscribe(u1);

        u2.sendMessage(u1, "Hi");
        u1.sendMessage(u2, "Hello!");
        u2.sendMessage(u1, "How are you?");
        u1.sendMessage(u2, "I am fine, what about you?");
        u2.sendMessage(u1, "I am nice!");

        System.out.println(u1.isSubscribed(u2));
        System.out.println(u1.isSubscribed(u3));
        System.out.println(u1.isFriend(u2));
        System.out.println(u3.isFriend(u2));

        MessageDataBase.showDialog(u1,u2);

    }
}

public class FriendOOP {
    static int friendsQuantity;
    String name;
    int age;

    FriendOOP(String name, int age) {
        this.name = name;
        this.age = age;
        friendsQuantity++;
    }

    static void showFriend() {
        System.out.printf("You have %d total friends\n", friendsQuantity);
    }
}

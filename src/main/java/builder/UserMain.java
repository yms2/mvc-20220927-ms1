package builder;

public class UserMain {

    public static void main(String[] args) {
        User user = User.UserBuilder.Userbuilder()
                .name("민성")
                        .username("yms")
                        .password("1234")
                        .build();
        System.out.println(user);
    }
}

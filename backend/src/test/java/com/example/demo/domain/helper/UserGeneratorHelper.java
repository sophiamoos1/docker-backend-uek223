package com.example.demo.domain.helper;
import com.example.demo.domain.user.User;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserGeneratorHelper {
    public static List<User> generateUserList() {
        User firstTestUser = new User();
        User secondTestUser = new User();

        UUID uuid1 = UUID.fromString("00000000-000-0000-0000-000000000001");
        UUID uuid2 = UUID.fromString("00000000-000-0000-0000-000000000002");

        firstTestUser.setId(uuid1);
        firstTestUser.setEmail("kunfi@example.com");
        firstTestUser.setFirstName("kunfi");
        firstTestUser.setLastName("kunfimann");
        firstTestUser.setPassword("123456");

        secondTestUser.setId(uuid2);
        secondTestUser.setEmail("jani@example.com");
        secondTestUser.setFirstName("jani");
        secondTestUser.setLastName("schefer");
        secondTestUser.setPassword("123456");
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(firstTestUser);
        listOfUsers.add(secondTestUser);
        return listOfUsers;
    }

    public static User generateUser() {
        User testUser = new User();
        testUser.setEmail("test@example.com");
        testUser.setPassword("tesst");
        testUser.setFirstName("test");
        testUser.setLastName("test");
        return testUser;
    }
}

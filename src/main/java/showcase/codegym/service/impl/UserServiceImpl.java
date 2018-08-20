package showcase.codegym.service.impl;

import showcase.codegym.model.User;
import showcase.codegym.service.CanNotResolveCredentialException;
import showcase.codegym.service.UserService;
import showcase.codegym.viewmodel.UserCredential;
import showcase.codegym.viewmodel.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserService singletonObject;

    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setUsername("john");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setUsername("bill");
        u2.setEmail("bill@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setUsername("mike");
        u2.setEmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    private UserServiceImpl() {
    }

    public static UserService getInstance() {
        if (singletonObject == null) {
            synchronized (UserServiceImpl.class) {
                if (singletonObject == null) {
                    singletonObject = new UserServiceImpl();
                }
            }
        }
        return singletonObject;
    }

    @Override
    public UserProfile checkLogin(UserCredential credential) throws CanNotResolveCredentialException {
        User matchesUser = findUserMatches(credential);
        if (matchesUser == null) {
            throw new CanNotResolveCredentialException("no any match for given username and password");
        }
        return getProfileForUser(matchesUser);
    }

    private User findUserMatches(UserCredential credential) {
        for (User user : users) {
            if (!hasMatchingUsername(credential, user) || !hasMatchingPassword(credential, user)) continue;
            return user;
        }
        return null;
    }

    private UserProfile getProfileForUser(User user) {
        UserProfile userProfile = new UserProfile();
        userProfile.setAge(user.getAge());
        userProfile.setEmail(user.getEmail());
        userProfile.setName(user.getName());
        userProfile.setUsername(user.getUsername());
        return userProfile;
    }

    private boolean hasMatchingUsername(UserCredential credential, User user) {
        return credential.getUsername().equals(user.getUsername());
    }

    private boolean hasMatchingPassword(UserCredential credential, User user) {
        return credential.getPassword().equals(user.getPassword());
    }
}

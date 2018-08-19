package showcase.codegym.service.impl;

import showcase.codegym.service.UserService;
import showcase.codegym.viewmodel.UserCredential;
import showcase.codegym.viewmodel.UserProfile;

public class UserServiceImpl implements UserService {
    private static UserService singletonObject;

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
    public UserProfile checkLogin(UserCredential credential) {
        UserProfile sampleProfile = new UserProfile();
        sampleProfile.setUsername(credential.getUsername());
        sampleProfile.setName("CodeGym Student");
        sampleProfile.setAge(2);
        sampleProfile.setEmail("student@codegym.vn");
        return sampleProfile;
    }

}

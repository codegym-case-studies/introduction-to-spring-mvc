package showcase.codegym.service;

import showcase.codegym.viewmodel.UserCredential;
import showcase.codegym.viewmodel.UserProfile;

public interface UserService {
    UserProfile checkLogin(UserCredential credential) throws CanNotResolveCredentialException;
}

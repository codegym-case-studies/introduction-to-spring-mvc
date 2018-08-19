package showcase.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import showcase.codegym.service.CanNotResolveCredentialException;
import showcase.codegym.service.UserService;
import showcase.codegym.service.impl.UserServiceImpl;
import showcase.codegym.viewmodel.UserCredential;
import showcase.codegym.viewmodel.UserProfile;

@Controller
@RequestMapping("/login")
public class LoginController {

    UserService userService = UserServiceImpl.getInstance();

    @GetMapping()
    public ModelAndView login() {
        UserCredential emptyCredential = new UserCredential();
        ModelAndView loginModelAndView = new ModelAndView("login/login", "credential", emptyCredential);
        return loginModelAndView;
    }

    @PostMapping()
    public ModelAndView dashboard(@ModelAttribute("credential") UserCredential credential) {
        try {
            UserProfile sampleProfile = userService.checkLogin(credential);
            ModelAndView loginModelAndView = new ModelAndView("dashboard/dashboard", "profile", sampleProfile);
            return loginModelAndView;
        } catch (CanNotResolveCredentialException e) {
            e.printStackTrace();
            ModelAndView loginModelAndView = new ModelAndView("login/error");
            return loginModelAndView;
        }
    }
}

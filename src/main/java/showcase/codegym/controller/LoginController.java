package showcase.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import showcase.codegym.viewmodel.UserCredential;
import showcase.codegym.viewmodel.UserProfile;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping()
    public ModelAndView login() {
        UserCredential emptyCredential = new UserCredential();
        ModelAndView loginModelAndView = new ModelAndView("login/login", "credential", emptyCredential);
        return loginModelAndView;
    }

    @PostMapping()
    public ModelAndView dashboard() {
        UserProfile sampleProfile = new UserProfile();
        sampleProfile.setUsername("codegymstudent");
        sampleProfile.setName("CodeGym Student");
        sampleProfile.setAge(2);
        sampleProfile.setEmail("student@codegym.vn");

        ModelAndView loginModelAndView = new ModelAndView("dashboard/dashboard", "profile", sampleProfile);
        return loginModelAndView;
    }
}

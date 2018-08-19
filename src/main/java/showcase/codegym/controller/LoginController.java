package showcase.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import showcase.codegym.viewmodel.UserCredential;

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
        ModelAndView loginModelAndView = new ModelAndView("dashboard/dashboard");
        return loginModelAndView;
    }
}

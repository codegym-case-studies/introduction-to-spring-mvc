package showcase.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import showcase.codegym.viewmodel.UserCredential;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView loginModelAndView = new ModelAndView("login/login");
        return loginModelAndView;
    }
}

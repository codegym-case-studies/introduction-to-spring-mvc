package showcase.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import showcase.codegym.viewmodel.EmployeeDetails;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping()
    public ModelAndView employeeSubmition() {
        EmployeeDetails details = new EmployeeDetails();
        ModelAndView modelAndView = new ModelAndView("employee/create", "details", details);
        return modelAndView;
    }

    @PostMapping()
    public ModelAndView employeeCreation(@ModelAttribute("details") EmployeeDetails employeeDetails) {
        ModelAndView modelAndView = new ModelAndView("employee/info", "profile", employeeDetails);
        return modelAndView;
    }
}

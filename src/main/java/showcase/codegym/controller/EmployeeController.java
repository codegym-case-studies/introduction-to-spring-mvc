package showcase.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import showcase.codegym.viewmodel.EmployeeDetails;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping()
    public ModelAndView employeeCreation() {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        return modelAndView;
    }
}

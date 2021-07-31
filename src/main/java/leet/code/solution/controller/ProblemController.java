package leet.code.solution.controller;

import leet.code.solution.enumeration.Problem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
@RequestMapping("/problem")
public class ProblemController {

    @GetMapping("{problemName}")
    public String getProblem(@PathVariable("problemName") String problemName, Model model) {
//        ModelAndView mav = new ModelAndView("problem");
//        mav.addObject("detail", Problem.getByValue(problemName).getRemarks());
        model.addAttribute("detail", Problem.getByValue(problemName).getRemarks());
        return "problem";
    }
}

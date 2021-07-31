package leet.code.solution.controller;

import leet.code.solution.enumeration.Problem;
import leet.code.solution.model.InputParameters;
import leet.code.solution.service.EasySolutionService;
import leet.code.solution.service.HardSolutionService;
import leet.code.solution.service.MediumSolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/solution")
public class SolutionController {

    @Autowired
    private EasySolutionService easySolutionService;

    @Autowired
    private MediumSolutionService mediumSolutionService;

    @Autowired
    private HardSolutionService hardSolutionService;

    @GetMapping("{problemName}")
    public String getProblem(
            @PathVariable("problemName") String problemName,
            @RequestParam(name = "nums", required = false) int[] nums,
            @RequestParam(name = "target", required = false) int target,
            @RequestParam(name = "targets", required = false) int[] targets,
            @RequestParam(name = "matrix2d", required = false) int[][] matrix2d,
            Model model
    ) {
//        ModelAndView mav = new ModelAndView("solution");
//        mav.addObject("detail", easySolutionService.process(Problem.getByValue(problemName), input));
        Problem problem = Problem.getByValue(problemName);

        InputParameters input = new InputParameters();
        input.setNums(nums);
        input.setTarget(target);
        input.setTargets(targets);
        input.setMatrix2d(matrix2d);

        switch (problem.getMode()) {
            case EASY -> model.addAttribute("detail" ,easySolutionService.process(problem, input));
            case MEDIUM -> model.addAttribute("detail" ,mediumSolutionService.process(problem, input));
            case HARD -> model.addAttribute("detail" ,mediumSolutionService.process(problem, input));
        }
        return "solution";
    }
}

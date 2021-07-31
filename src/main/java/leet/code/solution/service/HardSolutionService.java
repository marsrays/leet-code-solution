package leet.code.solution.service;

import leet.code.solution.enumeration.Problem;
import leet.code.solution.model.InputParameters;
import org.springframework.stereotype.Service;

@Service
public class HardSolutionService {

    public String process(Problem problem, InputParameters input) {
        // JAVA 14 新功能 Switch 表達式 (switch expression)
        return switch (problem) {
            default -> "No Solution";
        };
    }
}

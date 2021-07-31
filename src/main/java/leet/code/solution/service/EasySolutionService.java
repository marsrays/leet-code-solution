package leet.code.solution.service;

import leet.code.solution.enumeration.Problem;
import leet.code.solution.model.InputParameters;
import leet.code.solution.model.easy.RangeSumQueryImmutable;
import leet.code.solution.model.easy.TwoSum;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class EasySolutionService {

    public String process(Problem problem, InputParameters input) {
        // JAVA 14 新功能 Switch 表達式 (switch expression)
        return switch (problem) {
            case TWO_SUM -> Arrays.toString(new TwoSum().answer(input.getNums(), input.getTarget()));
            case ADD_TWO_NUMBERS -> "";
            case RANGE_SUM_QUERY_IMMUTABLE -> Arrays.toString(new RangeSumQueryImmutable(input.getNums()).sumRange(input.getTargets()));
            default -> "No Solution";
        };
    }
}

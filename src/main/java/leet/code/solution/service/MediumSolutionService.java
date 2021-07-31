package leet.code.solution.service;

import leet.code.solution.enumeration.Problem;
import leet.code.solution.model.InputParameters;
import leet.code.solution.model.medium.RangeSumQuery2DImmutable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MediumSolutionService {

    public String process(Problem problem, InputParameters input) {
        // JAVA 14 新功能 Switch 表達式 (switch expression)
        return switch (problem) {
            case RANGE_SUM_QUERY_2D_IMMUTABLE -> Arrays.toString(new RangeSumQuery2DImmutable(input.getMatrix2d()).sumRegion(input.getTargets()));
            default -> "No Solution";
        };
    }
}

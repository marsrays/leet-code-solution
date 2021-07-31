package leet.code.solution.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum Mode {
    UNKNOWN("UNKNOWN", "未知"),
    EASY("EASY", "簡單"),
    MEDIUM("MEDIUM", "普通"),
    HARD("HARD", "困難");

    private final String value;
    private final String remarks;

    private static final Map<String, Mode> MODE_MAP = new HashMap<>();

    static {
        for (Mode problem : Mode.values()) {
            if (Mode.UNKNOWN == problem) {
                continue;
            }

            // 所有期號狀態
            MODE_MAP.put(problem.getValue(), problem);
        }
    }

    Mode(String value, String remarks) {
        this.value = value;
        this.remarks = remarks;
    }

    public String getValue() {
        return this.value;
    }

    public String getRemarks() {
        return remarks;
    }

    public static Mode getByValue(String value) {
        return MODE_MAP.getOrDefault(value, Mode.UNKNOWN);
    }
}

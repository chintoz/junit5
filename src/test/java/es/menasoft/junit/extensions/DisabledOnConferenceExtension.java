package es.menasoft.junit.extensions;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisabledOnConferenceExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        return LocalDate.now().getDayOfWeek() == DayOfWeek.SATURDAY
                ? ConditionEvaluationResult.disabled("You are at the conferece")
                : ConditionEvaluationResult.enabled("Work hard!!!");
    }
}

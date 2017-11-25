package es.menasoft.junit.junit;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Class modify to JUnit 5
 */
public class ExceptionTestingDemoAfter {

    @Test
    void newApproach() {
        NumberFormatException expected = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("foo");
        });
        assertEquals("For input string: \"foo\"", expected.getMessage());
    }

    // Java 8 version. More cleaner and Java 8 style.

}

package es.menasoft.junit.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    @DisplayName("1 + 1 = 2")
    @RepeatedTest(100)
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Disabled("for some reasons")
    void anotherTest() {
        assertEquals(0, 1 + 1);
    }
}

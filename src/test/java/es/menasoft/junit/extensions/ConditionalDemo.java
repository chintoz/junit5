package es.menasoft.junit.extensions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ConditionalDemo {

    @Test
    @DisabledOnConference
    void conditionalTest() {
        fail("you have to stay in the office today");
    }
}

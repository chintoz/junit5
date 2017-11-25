package es.menasoft.junit.junit;



import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FirstTest {

    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Disabled("for some reasons")
    public void anotherTest() {
        assertEquals(0, 1 + 1);
    }

}

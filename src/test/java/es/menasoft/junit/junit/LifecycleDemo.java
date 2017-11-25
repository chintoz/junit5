package es.menasoft.junit.junit;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.Assert.assertEquals;

public class LifecycleDemo {


    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    public void beforeEach(TestInfo testInfo) {
        System.out.println("before each " + testInfo.getTestMethod() + " in " + this.getClass().getName());
    }

    @Test
    public void onePlusoOneIsTwo() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void zeroPlusoTwoIsTwo() {
        assertEquals(2, 0 + 2);
    }

    @AfterEach
    public void afterEach(TestInfo testInfo) {
        System.out.println("afterEach: " + testInfo.getTestMethod() + " in " + this.getClass().getName());
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }





}

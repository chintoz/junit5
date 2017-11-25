package es.menasoft.junit.junit;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestsDemo {

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream() {
        return IntStream.iterate(0, n -> n + 2).limit(100).mapToObj(n -> dynamicTest("test" + n, () -> {
            assertTrue(n % 2 == 0);
        }));
    }
}

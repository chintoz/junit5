package es.menasoft.junit.usage;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagsDemo {

    @Test
    @Tag("integration")
    @Tag("slow")
    public void integrationTest() {
    }
}

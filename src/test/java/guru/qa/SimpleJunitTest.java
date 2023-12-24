package guru.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleJunitTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("Egor hello");
    }

    @Test
    void firstTest() {

    }
}

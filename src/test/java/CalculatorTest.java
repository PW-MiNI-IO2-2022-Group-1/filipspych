import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
       assertEquals(12, new Calculator().add(5, 7));
    }
}
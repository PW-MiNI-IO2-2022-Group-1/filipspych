import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
       assertEquals(15, new Calculator().add(5, 10));
    }
}
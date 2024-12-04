import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5, new Calculator().add(2, 3));
    }

    @Test
    void dif() {
        assertEquals(2, new Calculator().dif(5, 3));
    }

    @Test
    void div() {
        assertEquals(2, new Calculator().div(6, 3));
    }

    @Test
    void times() {
        assertEquals(6, new Calculator().times(2, 3));
    }

    @Test
    void solver() {
        assertEquals(18, new Calculator().solver());
    }
}
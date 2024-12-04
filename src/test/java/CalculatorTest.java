import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(-3, calculator.dif(-2, 1));
        assertEquals(0, calculator.dif(0, 0));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(-2, calculator.div(-6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.div(6, 0)); // Проверка деления на ноль
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-6, calculator.times(-2, 3));
        assertEquals(0, calculator.times(0, 5));
    }

    @Test
    void solver() {
        assertEquals(24, calculator.solver()); // Проверка решения уравнения из метода solver
    }
}

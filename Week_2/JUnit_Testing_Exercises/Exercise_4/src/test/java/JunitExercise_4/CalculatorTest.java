package JunitExercise_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Create calculator before each test
        calculator = new Calculator();
        System.out.println("Setting up Calculator...");
    }

    @After
    public void tearDown() {
        // Cleanup after each test
        calculator = null;
        System.out.println("Cleaning up Calculator...");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        // Act
        int result = calculator.multiply(4, 5);

        // Assert
        assertEquals(20, result);
    }
}

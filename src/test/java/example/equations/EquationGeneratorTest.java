package example.equations;

import example.equations.EquationGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Sum of numbers divisible by 3 or 5
 */

public class EquationGeneratorTest extends EquationGenerator {

    @Test
    public void divisible3test() {
        EquationGeneratorTest a = new EquationGeneratorTest();
        boolean b = a.divisible(3);
        assertTrue(b);
    }

    @Test
    public void divisible5test() {
        EquationGeneratorTest a = new EquationGeneratorTest();
        boolean b = a.divisible(5);
        assertTrue(b);
    }

    @Test
    public void divisible4test() {
        EquationGeneratorTest a = new EquationGeneratorTest();
        boolean b = a.divisible(4);
        assertFalse(b);
    }

    @Test
    public void generateTest() {
        EquationGeneratorTest a = new EquationGeneratorTest();
        String s = a.generate(10);
        assertEquals("3+5+6+9=23", s);
    }

    @Test
    public void generate2Test() {
        EquationGeneratorTest a = new EquationGeneratorTest();
        String s = a.generate2(10);
        assertEquals("3+5+6+9=23", s);
    }

}

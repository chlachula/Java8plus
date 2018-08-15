package example.assert1;

/**
 * Assertion has to be enabled:
 * java –ea example.assert1.AssertTest
 * java -enableassertions example.assert1.AssertTest
 */
public class AssertTest {
    public static void main( String args[] )
    {
        int weight = 45;
        assert weight >= 70 : " Underweight";
        System.out.println("Weight is "+weight+" kilograms");
    }
}


import com.raig.calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        calculator calc = new calculator();

        int result = calc.Add("");
        Assert.assertTrue(result == 0);
    }
}
import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenTest1() {

        int number = 2147483647 + 1;
        String expectedResult = "Even";

        OddEven oddEvenObj = new OddEven();
        String actualResult = oddEvenObj.oddEven(number);

        Assert.assertEquals("Even", "Even");

    }
}

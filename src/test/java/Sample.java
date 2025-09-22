import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

    @Test
    public void additionTest() {
        int sum = 5 + 10;
        Assert.assertEquals(sum, 15, "Sum should be 15");
    }

    @Test
    public void subtractionTest() {
        int diff = 10 - 5;
        Assert.assertEquals(diff, 5, "Difference should be 5");
    }
}

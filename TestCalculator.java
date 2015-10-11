import org.testng.Assert;
import org.testng.annotations.Test;


@Test	
public class TestCalculator {
	public void EmptyStringReturnsZero() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.add(""), 0);
	}
}

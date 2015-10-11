import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test	
public class TestCalculator {
	
	private Calculator calc;
	@BeforeTest
	public void BeforeRun() {
		calc = new Calculator();
	}
	@Test
	public void EmptyStringReturnsZero() {
		Assert.assertEquals(calc.add(""), 0);
	}
	@Test
	public void ThisShouldReturnOneNumber() {
		Assert.assertEquals(calc.add("2"), 2);
	}
	@Test
	public void ThisShouldReturnTheSumofNumbers() {
		Assert.assertEquals(calc.add("2,3"), 5);
	}
	@Test
	public void ThisWillTestManyArguments() {
		Assert.assertEquals(calc.add("2,3,4,5,6,7"), 27);
	}
	@Test
	public void ThisWillTestNewlines() {
		Assert.assertEquals(calc.add("1\n2,3"), 6);
	}
}

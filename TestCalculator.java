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
		Assert.assertEquals(calc.add("3\n2\n1"), 6);
	}
	@Test 
	public void ThisWillTestDelimiter() {
		Assert.assertEquals(calc.add("//;\n1;2"), 3);
	}
	@Test(expectedExceptions = ArithmeticException.class)
	public void ThisWillTestNegativeNumber() {
		Assert.assertEquals(calc.add("2,-4,3,-5"), -1);
	}
	@Test
	public void ThisWillTestNumbersBiggerThanThousend() {
		Assert.assertEquals(calc.add("1001,1000,2"), 1002);
	}
	@Test
	public void ThisWillTestMultipleDelimiters() {
		Assert.assertEquals(calc.add("//*$!\n1*2$3"), 6);
	}
}

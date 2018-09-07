package calculatorTestNGListeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestNGListnerImplementationForCalculator {
	Calculator calculator = new Calculator();

	// Passing Test Cases

	@Test
	public void sumLongMethodPass() {
		Assert.assertEquals(5, calculator.sum(2, 3));
	}

	@Test
	public void sumDoubleMethodPass() {
		Assert.assertEquals(5.0, calculator.sum(2.0, 3.0));
	}

	@Test
	public void subLongMethodPass() {
		Assert.assertEquals(-1, calculator.sub(2, 3));
	}

	@Test
	public void subDoubleMethodPass() {
		Assert.assertEquals(-1.0, calculator.sub(2.0, 3.0));
	}

	@Test
	public void sqrtPass() {
		Assert.assertEquals(4.0, calculator.sqrt(16.0));
	}

	@Test
	public void sumLongMethodFail() {
		Assert.assertEquals(5, calculator.sum(2, 3));
	}

	@Test
	public void sumDoubleMethodFail() {
		Assert.assertEquals(4, calculator.sum(2.0, 3.0));
	}

	@Test
	public void subLongMethodFail() {
		Assert.assertEquals(2, calculator.sub(2, 3));
	}

	@Test
	public void subDoubleMethodFail() {
		Assert.assertEquals(2.0, calculator.sub(2.0, 3.0));
	}

	@Test
	public void sqrtFail() {
		Assert.assertEquals(22.0, calculator.sqrt(16.0));
	}
}

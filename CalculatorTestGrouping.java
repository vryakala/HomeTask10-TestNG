package calculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class CalculatorTestGrouping {

	Calculator calculator = new Calculator();

	// Passing Test Cases

	@Test(groups = { "Sanity", "regression" })
	public void sumLongMethodPass() {
		Assert.assertEquals(5, calculator.sum(2, 3));
		System.out.println("Sanity and Regression");
	}

	@Test(groups = { "Sanity", "regression" })
	public void sumDoubleMethodPass() {
		Assert.assertEquals(5.0, calculator.sum(2.0, 3.0));
		System.out.println("Sanity and Regression");
	}

	@Test(groups = { "Sanity", "regression" })
	public void subLongMethodPass() {
		Assert.assertEquals(-1, calculator.sub(2, 3));
		System.out.println("Sanity and Regression");

	}

	@Test(groups = { "Sanity", "regression" })
	public void subDoubleMethodPass() {
		Assert.assertEquals(-1.0, calculator.sub(2.0, 3.0));
		System.out.println("Sanity and Regression");
	}

	@BeforeGroups(groups = { "Sanity" })
	public void sqrtPass() {
		Assert.assertEquals(4.0, calculator.sqrt(16.0));
		System.out.println("@BeforeGroups");
		System.out.println("Sanity");
	}
	// Failure Test Cases

	@Test(groups = { "Sanity" })
	public void sumLongMethodFail() {
		Assert.assertNotEquals(4, calculator.sum(2, 3));
		System.out.println("Sanity");
	}

	@Test(groups = { "Sanity" })
	public void sumDoubleMethodFail() {
		Assert.assertNotEquals(4.0, calculator.sum(2.0, 3.0));
		System.out.println("Sanity");
	}

	@Test(groups = { "Sanity" })
	public void subLongMethodFail() {
		Assert.assertNotEquals(1, calculator.sub(2, 3));
		System.out.println("Sanity");
	}

	@Test(groups = { "Sanity" })
	public void subDoubleMethodFail() {
		Assert.assertNotEquals(1.0, calculator.sub(2.0, 3.0));
		System.out.println("Sanity");
	}

	@AfterGroups(groups = { "Sanity" })
	public void sqrtFail() {
		Assert.assertNotEquals(2.0, calculator.sqrt(16.0));
		System.out.println("@AfterGroups");
		System.out.println("Sanity");
	}
}

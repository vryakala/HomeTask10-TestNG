package calculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class CalculatorTest {
	Calculator calculator = new Calculator();

	// Passing Test Cases

	@BeforeSuite
	public void sumLongMethodPass() {
		Assert.assertEquals(5, calculator.sum(2, 3));
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void sumDoubleMethodPass() {
		Assert.assertEquals(5.0, calculator.sum(2.0, 3.0));
		System.out.println("@BeforeTest");
	}

	@BeforeClass
	public void subLongMethodPass() {
		Assert.assertEquals(-1, calculator.sub(2, 3));
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	public void subDoubleMethodPass() {
		Assert.assertEquals(-1.0, calculator.sub(2.0, 3.0));
		System.out.println("@BeforeMethod");
	}

	@Test
	public void sqrtPass() {
		Assert.assertEquals(4.0, calculator.sqrt(16.0));
		System.out.println("@Test1");
	}
	// Failure Test Cases

	@AfterSuite
	public void sumLongMethodFail() {
		Assert.assertNotEquals(4, calculator.sum(2, 3));
		System.out.println("@AfterSuite");
	}

	@AfterTest
	public void sumDoubleMethodFail() {
		Assert.assertNotEquals(4.0, calculator.sum(2.0, 3.0));
		System.out.println("@AfterTest");
	}

	@AfterClass
	public void subLongMethodFail() {
		Assert.assertNotEquals(1, calculator.sub(2, 3));
		System.out.println("@AfterClass");
	}

	@AfterMethod
	public void subDoubleMethodFail() {
		Assert.assertNotEquals(1.0, calculator.sub(2.0, 3.0));
		System.out.println("@AfterMethod");
	}

	@Test
	public void sqrtFail() {
		Assert.assertNotEquals(2.0, calculator.sqrt(16.0));
		System.out.println("@Test2");
	}
}

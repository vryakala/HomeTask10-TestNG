package calculatorTestNG;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CalculatorDataDriven {
	Calculator calculator = new Calculator();

	@Test(dataProvider = "testdata")
	public void calc(String val1, String val2) {
		int sum = (int) calculator.sum(Integer.parseInt(val1), Integer.parseInt(val2));
		System.out.println("Sum is:" + sum);
	}

	@DataProvider(name = "testdata")
	public Object[][] readExcel() {
		File file = new File("D:/Input.xls");
		Workbook workbook;
		try {
			workbook = Workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			int columns = sheet.getColumns();
			System.out.println(rows);
			System.out.println(columns);
			String InputData[][] = new String[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					Cell cell = sheet.getCell(j, i);
					InputData[i][j] = cell.getContents();
					System.out.println(InputData[i][j]);
				}
			}
			return InputData;
		} catch (

		BiffException e1) {
			System.out.println("BiffException");
			e1.printStackTrace();
		} catch (IOException e2) {
			System.out.println("IOException");
			e2.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("Index out of bound");
			e3.printStackTrace();
		}
		return null;

	}
}

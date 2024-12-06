package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXML {

	public String getCellData(String sheetName, int row, int cell) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//Test Data/creds.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(file)) {
			XSSFSheet sheet = wb.getSheet(sheetName);
			String cellData = sheet.getRow(row).getCell(cell).toString();

			return cellData;
		}

	}

}

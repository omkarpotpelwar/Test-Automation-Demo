package readers;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	
	public static String[] getDataFromExcel() throws Exception {
		String[] dataArray = new String[2];

		PropertiesReader propertiesReader = new PropertiesReader();
		
		String fileName = propertiesReader.fetchExcelFileName();
		
		String filePath = FileHelper.getBasePath() + "//src//" + fileName;
		
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(1);
		
		for(int i=0;i<2;i++) {
			dataArray[i] = String.valueOf(row.getCell(i));
		}
		return dataArray;
	}

}

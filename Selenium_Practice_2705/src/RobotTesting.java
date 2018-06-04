import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RobotTesting {

	public String[][] getTestData() throws AWTException, IOException {
		FileInputStream fis=new FileInputStream("E:\\JavaWorkspace\\Selenium_Practice_2705\\TestFiles\\UsersList.xlsx");
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	DataFormatter formatter = new DataFormatter();
	
	XSSFSheet ws = wb.getSheet("Sheet1");
	int rowCount = ws.getLastRowNum();
	int colCount = ws.getRow(0).getLastCellNum();
	System.out.println(rowCount);
	System.out.println(colCount);
	String[][] s=new String[rowCount+1][colCount];
	for(int i=0;i<rowCount+1;i++) {
		for(int j=0;j<colCount;j++) {
			Cell cell=ws.getRow(i).getCell(j);
			 s[i][j] = formatter.formatCellValue(cell);
			System.out.println("v["+i+"]["+j+"]");
		}
	}	
	return s;
}

}

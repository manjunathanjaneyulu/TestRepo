import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTesting {
private XSSFWorkbook wb;
private XSSFSheet sht;
public FileInputStream fis;
public FileOutputStream fos;
public String path;


public ExcelTesting() throws IOException {
	path="D:\\Java_Excercise\\POI\\SampleData.xlsx";
	  fos = new FileOutputStream("D:\\Java_Excercise\\POI\\SampleData.xlsx");
	fis=new FileInputStream(path);
	wb=new XSSFWorkbook(fis);
	//sht=wb.getSheetAt(0);
}
//

public  String[][] readexcelvalues() {
	DataFormatter df =new DataFormatter(); 
	//int index=wb.getSheetIndex("Sheet1");
	sht=wb.getSheet("SalesOrders");
	System.out.println(sht.getLastRowNum());
	System.out.println(sht.getPhysicalNumberOfRows());
	int rowCount=sht.getLastRowNum();
	System.out.println(rowCount);
	int colCount=sht.getRow(0).getLastCellNum();
	System.out.println(colCount);
	String[][] s=new String[rowCount+1][colCount];
	for(int i=0;i<rowCount+1;i++) {
		for(int j=0;j<colCount;j++) {
			Cell cell=sht.getRow(i).getCell(j);
			s[i][j]=df.formatCellValue(cell);
			System.out.println("s["+i+"]["+j+"] "+s[i][j]);
		}
	}
	
return s;
}

public void writeexcelvalues(String v[][]) throws IOException {
	int row=v.length;
	int col=v[0].length;
	System.out.println(row);
	System.out.println(col);
	wb.createSheet("Sheet1");
	sht=wb.getSheet("Sheet1");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			sht.getRow(i).getCell(j).setCellValue(v[i][j]);
		}
	}
	wb.write(fos);
	fos.close();
	wb.close();
}

}

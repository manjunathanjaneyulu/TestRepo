import java.io.IOException;

public class ExcelTestingMain {

	public static void main(String[] args) throws IOException {
ExcelTesting e=new ExcelTesting();
String a[][]=e.readexcelvalues();
e.writeexcelvalues(a);
	}

}

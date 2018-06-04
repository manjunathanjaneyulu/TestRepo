package PackageOne;

import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Manage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\DO NOT DELETE\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("manzu.tg01@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ManjunathA@01");
		driver.findElement(By.id("loginbutton")).click();
				
		File file=new File("Cookies.data");
		try {
			file.delete();
			file.createNewFile();
			FileWriter filewrite=new FileWriter(file);
			BufferedWriter Bwrite=new BufferedWriter(filewrite);
			
			for(Cookie ck:driver.manage().getCookies()) {
				Bwrite.write(ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure());
				Bwrite.newLine();
			}
			Bwrite.close();
			filewrite.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
//		System.out.println(driver.manage().getCookies());
//		System.out.println(driver.manage().toString());
//		System.out.println(driver.manage().getClass());
//		System.out.println(driver.manage().hashCode());
//		//driver.manage().deleteAllCookies();
//		System.out.println(driver.manage().getCookies());
		driver.quit();
	}
}

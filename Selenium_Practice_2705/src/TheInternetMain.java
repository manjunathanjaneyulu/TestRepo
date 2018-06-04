import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TheInternetMain {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "E:\\\\DO NOT DELETE\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-fullscreen");
		WebDriver d=new ChromeDriver(options);
		d.get("http://the-internet.herokuapp.com/");
		Runtime.getRuntime().exec("C:\\Users\\acer\\Desktop\\Window\\WindowAuthentication.exe");
		System.out.println("File Ran");
		d.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
		Thread.sleep(2000);
		
//		d.switchTo().alert();
		
	}

}

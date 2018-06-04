package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class Test1 {

	public static void main(String[] args) throws InterruptedException{

////		//Opening Chrome
//		System.setProperty("webdriver.chrome.driver",  "E:\\DO NOT DELETE\\chromedriver_win32\\chromedriver.exe");
//		WebDriver d=new ChromeDriver();
//		System.out.println("Opening Browser");
//		d.get("https://www.google.com");
//		System.out.println("Waiting for the browser to Open");
//		Thread.sleep(10000);
//		d.quit();
//		System.out.println("Browser is closed "
//				+ "");
		
		//Opening FireFox
		System.setProperty("webdriver.gecko.driver", "E:\\DO NOT DELETE\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		System.out.println("Opening Browser");
		d1.get("https://www.facebook.com");
		System.out.println("Waiting for the browser to Open");
		Thread.sleep(10000);
		d1.quit();
		System.out.println("Browser is closed");	
		
	}

}

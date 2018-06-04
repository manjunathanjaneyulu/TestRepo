import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "E:\\DO NOT DELETE\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(4000);
		driver.close();
		driver.quit();	
	}

}

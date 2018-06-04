import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\DO NOT DELETE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(4000);
		driver.close();
		driver.quit();	
	}

}

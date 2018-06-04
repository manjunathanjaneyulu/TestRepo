package PackageOne;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class DriverOptions {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "E:\\DO NOT DELETE\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebDriver driver1=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Browser is Opened");
		Thread.sleep(10000);
		System.out.println(driver.getCurrentUrl()); //https://www.facebook.com/
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getTitle()); //Facebook – log in or sign up
		//System.out.println(driver.getWindowHandle()); //4294967297
		//System.out.println(driver.getWindowHandles()); //[4294967297]
		//System.out.println(driver.getClass()); //class org.openqa.selenium.firefox.FirefoxDriver
		//System.out.println(driver.equals(driver)); //false
		//System.out.println(driver.toString()); //FirefoxDriver: firefox on XP (1bd28006-77a3-468f-91e8-e42f2d84343f)
		System.out.println(driver.hashCode()); //783191662
		System.out.println("Hello World");
		driver1.get("https://www.google.com");
		driver.close();
		driver1.quit();
	}

}

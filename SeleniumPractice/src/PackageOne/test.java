package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\DO NOT DELETE\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		System.out.println("Browser is Opened");
		Thread.sleep(10000);
		driver.findElement(By.id("email")).sendKeys("manzu.tg01@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ManjunathA@01");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Adding through GitHUB");
		

	}

}

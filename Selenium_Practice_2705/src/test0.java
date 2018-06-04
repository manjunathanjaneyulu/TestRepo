import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\DO NOT DELETE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http://localhost/login.do");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		Robot r=new Robot();
		d.findElement(By.xpath("//a[@class='content users']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("userDataLightBox_timeZoneGroupSelectorPlaceholder")).click();
		Thread.sleep(2000);
		//d.findElement(By.xpath("//div[@class='x-shadow']/following-sibling::div[3]/ul[1]/li[3]/a/div[2]")).click();
		d.findElement(By.xpath("//div[@class='timeZoneGroupName'][@title='London Office']")).click();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

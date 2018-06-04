import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		RobotTesting rtest=new RobotTesting();
		String v[][]=rtest.getTestData();
		System.setProperty("webdriver.chrome.driver", "E:\\\\DO NOT DELETE\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-fullscreen");
		WebDriver d=new ChromeDriver(options);
		
		d.get("http://localhost/login.do");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		Robot r=new Robot();
		d.findElement(By.xpath("//a[@class='content users']")).click();
		Thread.sleep(2000);
		 int row = v.length;
		 int col = v[0].length;
		 int odd_or_even=2;
		for(int i=1;i<row;i++) {
				d.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
				d.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(v[i][0]);
				Thread.sleep(2000);
				d.findElement(By.id("userDataLightBox_middleNameField")).sendKeys(v[i][1]);
				Thread.sleep(2000);
				d.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(v[i][2]);
				Thread.sleep(2000);
				d.findElement(By.id("userDataLightBox_emailField")).sendKeys(v[i][3]);
				Thread.sleep(2000);
				d.findElement(By.id("userDataLightBox_usernameField")).sendKeys(v[i][4]);
				Thread.sleep(2000);
				d.findElement(By.id("userDataLightBox_passwordField")).sendKeys(v[i][5]);
				Thread.sleep(2000);
				d.findElement(By.name("passwordCopy")).sendKeys(v[i][5]);
				Thread.sleep(2000);
				//Select dropdowns=new Select((d.findElement(By.className("x-menu-list-item "))));
				//dropdowns.selectByIndex(3);
				d.findElement(By.xpath("//div[@id='userDataLightBox_timeZoneGroupSelectorPlaceholder']/table/tbody/tr/td[2]/em/button/div[2]")).click();	
				Thread.sleep(2000);
//				System.out.println(odd_or_even);
//				WebDriverWait wait = new WebDriverWait(d,15);  //500ms
//				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='timeZoneGroupName'][@title='Sydney Office']")));
//				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='timeZoneGroupName'][@title='Sydney Office']")));
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='timeZoneGroupName'][@title='Sydney Office']")));
//				if(odd_or_even%2==0) {
//					System.out.println("Inside First Loop");
					d.findElement(By.xpath("//div[@class='x-shadow']/following-sibling::div[1]/ul[@class='x-menu-list']/li[3]/a/div[2]")).click();	
//				}
//				else {
//					Thread.sleep(2000);
//					System.out.println("Inside Second Loop");
//					d.findElement(By.xpath("//div[@class='timeZoneGroupName'][@title='Sydney Office']")).click();
//				}
//				r.keyPress(KeyEvent.VK_DOWN);
//				r.keyRelease(KeyEvent.VK_DOWN);
//				Thread.sleep(2000);
//				r.keyPress(KeyEvent.VK_DOWN);
//				r.keyRelease(KeyEvent.VK_DOWN);
//				Thread.sleep(2000);
//				r.keyPress(KeyEvent.VK_ENTER);
//				r.keyRelease(KeyEvent.VK_ENTER);
				//d.findElement(By.xpath("*//div[text()='London Office']")).click();
				Thread.sleep(2000);
				if(d.findElement(By.xpath("//td[@class='checkbox_description']/preceding-sibling::td[1]/input[@type='checkbox']")).isEnabled()) {
					d.findElement(By.xpath("//td[@class='checkbox_description']/preceding-sibling::td[1]/input[@type='checkbox']")).click();
					Thread.sleep(3000);
				}
				Thread.sleep(2000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[1]/input")).clear();
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[1]/input")).sendKeys(v[i][6]);
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[2]/input")).clear();
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[2]/input")).sendKeys(v[i][7]);
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[3]/input")).clear();
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[3]/input")).sendKeys(v[i][8]);
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[4]/input")).clear();
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[4]/input")).sendKeys(v[i][9]);
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[5]/input")).clear();
				Thread.sleep(1000);
				d.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[5]/input")).sendKeys(v[i][10]);
				Thread.sleep(1000);
				d.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(2000);
//				odd_or_even++;
			}
		d.findElement(By.xpath("//a[text()='Logout']")).click();
		d.close();
		}	
}

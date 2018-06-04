package Internet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ChallengingDOM {

	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "E:\\\\DO NOT DELETE\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-fullscreen");
		WebDriver d=new ChromeDriver(options);
		Actions a =new Actions(d);
		Robot r=new Robot();
		d.get("http://the-internet.herokuapp.com/");
		d.findElement(By.xpath("//a[text()='Challenging DOM']")).click();
//		//Clicking First Element
//		System.out.println("Clicking First Button");
//		d.findElement(By.xpath("//a[@class='button']")).click();
//		Thread.sleep(2000);
//		System.out.println("Button1 Value "+d.findElement(By.xpath("//a[@class='button']")).getText());
//		System.out.println("Button2 Value "+d.findElement(By.xpath("//a[@class='button alert']")).getText());
//		System.out.println("Button3 Value "+d.findElement(By.xpath("//a[@class='button success']")).getText());
//		Thread.sleep(2000);
//		a.contextClick(d.findElement(By.id("canvas"))).build().perform();
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		//Clicking Second Element
//		System.out.println("Clicking Second Button");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//a[@class='button alert']")).click();
//		Thread.sleep(2000);
//		System.out.println("Button1 Value "+d.findElement(By.xpath("//a[@class='button']")).getText());
//		System.out.println("Button2 Value "+d.findElement(By.xpath("//a[@class='button alert']")).getText());
//		System.out.println("Button3 Value "+d.findElement(By.xpath("//a[@class='button success']")).getText());
//		Thread.sleep(2000);
//		a.contextClick(d.findElement(By.id("canvas"))).build().perform();
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		//Clicking Third Element
//		System.out.println("Clicking Third Button");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//a[@class='button success']")).click();
//		Thread.sleep(2000);
//		System.out.println("Button1 Value "+d.findElement(By.xpath("//a[@class='button']")).getText());
//		System.out.println("Button2 Value "+d.findElement(By.xpath("//a[@class='button alert']")).getText());
//		System.out.println("Button3 Value "+d.findElement(By.xpath("//a[@class='button success']")).getText());
//		Thread.sleep(2000);
//		a.contextClick(d.findElement(By.id("canvas"))).build().perform();
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		//*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[1]
		
		for(int k=1;k>0;k--) {
			for(int j=1;j<=7;j++) {
		System.out.print(d.findElement(By.xpath("//div[@class='large-10 columns']/table/thead/tr["+k+"]/th["+j+"]")).getText());
		System.out.print("  ");
			}
			System.out.println();
			k--;
		}
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=7;j++) {
				if(j==7) {
					System.out.print(d.findElement(By.xpath("//div[@class='large-10 columns']/table/tbody/tr["+i+"]/td["+j+"]/a[1]")).getText());
					System.out.print("  ");
					System.out.print(d.findElement(By.xpath("//div[@class='large-10 columns']/table/tbody/tr["+i+"]/td["+j+"]/a[2]")).getText());
					System.out.print("  ");
				}
				else {
					System.out.print(d.findElement(By.xpath("//div[@class='large-10 columns']/table/tbody/tr["+i+"]/td["+j+"]")).getText());
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
	}

}

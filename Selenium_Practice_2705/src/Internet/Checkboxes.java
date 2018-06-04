package Internet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\\\DO NOT DELETE\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-fullscreen");
		WebDriver d=new ChromeDriver(options);
		d.get("http://the-internet.herokuapp.com/");
		d.findElement(By.xpath("//a[starts-with(text(),'Check')]")).click();
		
		//Is Displayed
		System.out.println("Is Displayed " + d.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isDisplayed());
		System.out.println("Is Displayed " + d.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isDisplayed());
		
		//Is Enabled
		System.out.println("Is Enabled " + d.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isEnabled());
		System.out.println("Is Enabled " + d.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isEnabled());
		
		//Is Selected
		System.out.println("Is Selected " + d.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected());
		System.out.println("Is Selected " + d.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected());
		
		//Select checbox1 and deselect checkbox2 and display is selected values
		d.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
		Thread.sleep(2000);
		System.out.println("After selecting " + d.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected());
		System.out.println("After selecting " + d.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected());

		//Display Checkboxes Text
		System.out.println("After selecting " + d.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).getText());
		System.out.println("After selecting " + d.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).getText());
		
		//Display Checkboxes Text
		List<WebElement> checkboxes=d.findElements(By.xpath("//*[@id='checkboxes']"));
		for (WebElement checkbox: checkboxes) {
		   System.out.println(checkbox.getText());
		}
		
		
	}

}

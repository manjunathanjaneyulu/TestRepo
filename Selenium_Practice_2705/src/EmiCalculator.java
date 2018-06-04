import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.os.WindowsUtils;

public class EmiCalculator {

	public static void main(String[] args) throws InterruptedException{
//WindowsUtils.killByName("WINWORD.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\\\DO NOT DELETE\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("--start-fullscreen");
		WebDriver d=new ChromeDriver(options);
		Actions a = new Actions(d);
		d.get("https://emicalculator.net/");
		d.findElement(By.id("loanamount")).clear();
		Thread.sleep(2000);
		d.findElement(By.id("loanamount")).sendKeys("100000");
		Thread.sleep(2000);
		System.out.println(d.findElement(By.xpath("//div[@id='loaninterestslider']/span")).getSize());
		System.out.println(d.findElement(By.xpath("//div[@id='loaninterestslider']/span")).getLocation());
		
		a.dragAndDropBy(d.findElement(By.xpath("//div[@id='loaninterestslider']/span")), 200, 0).build().perform();
		Thread.sleep(2000);
		System.out.println("Action1 completed");
		a.dragAndDropBy(d.findElement(By.xpath("//div[@id='loantermslider']/span")), 120, 0).build().perform();
		Thread.sleep(2000);
	
		System.out.println("Action2 completed");
		
		a.dragAndDropBy(d.findElement(By.xpath("//div[@id='loaninterestslider']/span")), -100, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(d.findElement(By.xpath("//div[@id='loantermslider']/span")), -100, 0).build().perform();
		Thread.sleep(2000);
		
		a.clickAndHold(d.findElement(By.xpath("//div[@id='loaninterestslider']/span"))).moveByOffset(260, 0).release().build().perform();
		Thread.sleep(2000);
		a.clickAndHold(d.findElement(By.xpath("//div[@id='loantermslider']/span"))).moveByOffset(360, 0).release().build().perform();
		Thread.sleep(2000);
		
		System.out.println(d.findElement(By.xpath("//div[@id='emiamount']/p/span")).getText());
		System.out.println(d.findElement(By.xpath("//div[@id='emitotalamount']/p/span")).getText());
		System.out.println(d.findElement(By.xpath("//div[@id='emitotalinterest']/p/span")).getText());
	}

}

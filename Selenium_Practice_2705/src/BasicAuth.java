import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuth {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.gecko.driver", "E:\\\\DO NOT DELETE\\\\geckodriver-v0.20.1-win64\\\\geckodriver.exe");
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("--start-fullscreen");
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		//Method1
		d.get("http://the-internet.herokuapp.com/");
		Runtime.getRuntime().exec("C:\\Users\\acer\\Desktop\\Window\\WindowAuthentication_2.exe");
		d.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
		//Method2
		//d.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
	}

}

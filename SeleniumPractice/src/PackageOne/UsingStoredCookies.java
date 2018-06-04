package PackageOne;

import java.io.*;

import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingStoredCookies {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\DO NOT DELETE\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		try {
			File file=new File("Cookies.data");
			BufferedReader breader=new BufferedReader(new FileReader(file));
			String str;
			while((str=breader.readLine())!=null) {
				StringTokenizer strtoken=new StringTokenizer(str,";");
				while(strtoken.hasMoreTokens()) {
					String name=strtoken.nextToken();
					String value=strtoken.nextToken();
					String domain=strtoken.nextToken();
					String path=strtoken.nextToken();
					
					Date expiry=null;
					String val;
					SimpleDateFormat formatter = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
					
					if(!((val=strtoken.nextToken()).equals("null"))){
						expiry = formatter.parse(val);
					}
					Boolean isSecure=new Boolean(strtoken.nextToken()).booleanValue();
					
					Cookie ck=new Cookie(name,value,domain,path,expiry,isSecure);
					System.out.println(ck);
					driver.manage().addCookie(ck);
					}
					
				}
				
			}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		driver.get("https://www.facebook.com");			
		}

	}

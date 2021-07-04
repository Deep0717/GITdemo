package log4jdemo2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logTest {
	@Test(priority = 1)
	public void show()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver d = new ChromeDriver(); 
		d.get("https://mvnrepository.com/");
		d.manage().window().fullscreen();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(d.getCurrentUrl());
		d.quit();
		
		
		
	}
	
		
	}


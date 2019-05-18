package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	
	 WebDriver d;
	 @BeforeTest
	 public void launchB() 
	 {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Hemant\\Downloads\\IEDriverServer_Win32_3.14.0 (1)\\IEDriverServer.exe");
		d=new InternetExplorerDriver();
		d.manage().window().maximize();
	 }
	 
	 @Test
	 public void test()throws InterruptedException
	 {	
			d.navigate().to("https://www.google.com/");
			//Thread.sleep(1000);
			d.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java Tpoint tutorial");
			//Thread.sleep(4000);
			d.findElement(By.xpath("//input[@name='btnK']")).click();
	 }
	 
	 @AfterTest
	 public void kill()
	 {
	
		 d.quit();
	}
	}



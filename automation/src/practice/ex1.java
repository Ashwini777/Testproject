package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ex1 {
	public WebDriver d;
	@BeforeTest
	public void setdriver()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test
	public void test()
	{
		d.get("https://www.google.com/");

	String expectedPageTitle="google";
	Assert.assertTrue(d.getTitle().contains(expectedPageTitle),"TestFailed");
	}
	
	@AfterTest
	public void killb()
		{
	d.quit();
}
}
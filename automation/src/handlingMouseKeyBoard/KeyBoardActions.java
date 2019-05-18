package handlingMouseKeyBoard;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyBoardActions {
	WebDriver d;
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("BeforeTest");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void kill() {
		//d.quit();
	}
	@Test
	public void testNewTab() throws Exception
	{
		//Load web page
		d.get("https://www.google.co.in");
		assertEquals("Google",d.getTitle());
		WebElement link1=d.findElement(By.linkText("Gmail"));
		Actions a=new Actions(d);
		a.moveToElement(link1).keyDown(Keys.CONTROL).click(link1).build().perform();
		Thread.sleep(1000);
		a.keyDown(Keys.ALT).sendKeys(Keys.F4).build().perform();
		Thread.sleep(4000);
		
	}
}

package handlingMouseKeyBoard;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
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
		d.close();
	}
	@Test
	public void testDragNDrop() throws Exception
	{
		//Load web page
		d.get("http://jqueryui.com/droppable/");
		assertEquals("Droppable | jQuery UI",d.getTitle());
		//Switch driver focus to frame
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		a.dragAndDrop(d.findElement(By.id("draggable")), d.findElement(By.id("droppable"))).perform();
		//a.clickAndHold(d.findElement(By.id("draggable"))).moveToElement(d.findElement(By.id("droppable"))).release().build().perform();
		Thread.sleep(4000);
	}
	
}


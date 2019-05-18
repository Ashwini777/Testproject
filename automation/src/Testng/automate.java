package Testng;


import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class automate {
	WebDriver d;
	@BeforeTest
	public void launchb()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
 @AfterTest
 public void kill()
 {
	 d.quit();
 }
 @Test
 public void Automate()
 {
	 d.get("http://jqueryui.com/autocomplete/");
	 assertEquals("Autocomplete | jQuery UI",d.getTitle());
	 d.findElement(By.id("tags")).sendKeys("a");
	 List<WebElement> s=d.findElements(By.className("ui-menu-item"));
	 System.out.println("No of suggestions:"+s.size());
	 System.out.println("******************* Suggestions are *******************");
	
	for(WebElement e:s)
	{
		System.out.println(e.getText());
	}
	
	if(s.size()>=5)
	{
		for(int i=0;i<5;i++)
		{
			d.findElement(By.id("tags")).sendKeys(Keys.ARROW_DOWN);
		}
			d.findElement(By.id("tags")).sendKeys(Keys.ENTER);

		}
	 }

 
 
 
 
 private void assertEquals(String string, String title) {
	// TODO Auto-generated method stub
	
}
}

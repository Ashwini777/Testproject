package Testng;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class screen {
	WebDriver d;
	@BeforeTest
	public void Browserlanuch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
	}
@AfterTest
public void killBrowser()
{
	d.quit();
}
@Test
public void scrnshotfail() throws Exception{
	assertEquals("fail", getScreenshot());
}
private void assertEquals(String string, String screenshot) {
	// TODO Auto-generated method stub
	
}
public String getScreenshot() throws Exception
{try
{
	d.get("https://www.google.com/");
d.findElement(By.linkText("Gmailg")).click();
return "pass";
	
}catch(Exception e)
{ DateFormat dateformat =new SimpleDateFormat("dd-mm-yyyy HH-MM-SS");
Date dt=new Date();
File screenshotFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File("E:\\New folder\\"+dateformat.format(dt)+".png" ));
	return "fail";
}

}

}

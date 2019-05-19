package Testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class APPLICATIONFORM {
	WebDriver d;
	@BeforeTest
	public void setbrowser()throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\Downloads\\chromedriver_win32\\chromedriver (2).exe");
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}	
	@AfterTest()
	public void killb()
	{
		d.quit();
	}
 
	@Test
   public void Testlink()throws InterruptedException
    {
	  d.get("https://www.toolsqa.com/automation-practice-form/");
	  System.out.println(d.getTitle());
	  assertEquals("Demo Form for practicing Selenium Automation",d.getTitle());
	  Thread.sleep(2000);
	 
	 d.findElement(By.partialLinkText("Partial Link Test")).click();
	
	 Thread.sleep(2000);
	 
	 WebElement e0= d.findElement(By.linkText("Link Test"));e0.click();
		 System.out.println(e0.getText());
		 d.switchTo().defaultContent();
	 }	 
	 	 @Test
	 public void Textbox() throws InterruptedException
	 {
	 d.findElement(By.xpath("(input[@name='firstname'])")).sendKeys("Ashwini");
	 d.findElement(By.xpath("(input[@name='lastname'])")).sendKeys("Kudale");
	 
	 WebElement e =d.findElement(By.id("sex-0"));
	 if(!e.isSelected())
	 {e.click();}
	
	 WebElement e2=d.findElement(By.name("exp"));
	 if(!e.isSelected())
	 {e2.click();}
	 d.findElement(By.id("datepicker")).sendKeys("12-02-2001");
	 	 }
	 
	 
	 	 @Test
	 	 public void checkbox()throws InterruptedException
	 	 {
	 		WebElement e3=d.findElement(By.xpath("//input[@id='profession-0']"));
	 		
	 		if(!e3.isSelected())
	 		{
	 		 e3.click();
	 		}
	 	WebElement e4=d.findElement(By.xpath("//input[@id='profession-1']"));
	 		if(!e4.isSelected())
	 	 	{
	 		 e4.click();
	 	 	}
	  	 }
   
   @Test
   public void uploadphoto()throws InterruptedException
   {
	  WebElement e4 = d.findElement(By.xpath("//input[@class='input-file']"));
	  e4.sendKeys("C:\\Users\\Hemant\\Desktop\\ash.jpeg");
	    
   }
	
	@Test
	public void uploadfile()throws InterruptedException, IOException
	{
		  // Click on Browse Button
		  d.findElement(By.xpath("html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).click();
		  
		  //After pop-up open, below script is used to upload the file
		  Runtime.getRuntime().exec("C:UsersPrakashDesktopTestScript.exe");

	}
	private void assertEquals(String string, String title) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void downloadfile()throws IOException
	{
		WebElement e5=d.findElement(By.linkText("Selenium Automation Hybrid Framework"));
	 String source=e5.getAttribute("href");
	 String wget_cmd="cmd /c wget -p c:"+ source;
	 
	 try {
	        Process exec = Runtime.getRuntime().exec(wget_cmd);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	        } catch (InterruptedException | IOException ex) {
	        System.out.println(ex.toString());
	        }
	}
}

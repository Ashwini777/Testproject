package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args)throws InterruptedException  {
		
		System.out.println("Welcome to selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		System.out.println(d.getTitle());
		String a[]={"Create a new account","It's free and always will be."};
		for(String aa:a)
		{
			System.out.println(aa   +d.getPageSource().contains("a"));
		}
	//	System.out.println("check text in page:"+d.getPageSource().contains("Create a new account"));
		System.out.println("check button id enable:"+d.findElement(By.id("u_0_2")).isEnabled());
		System.out.println("check button id enable:"+d.findElement(By.name("websubmit")).isEnabled());
		//d.findElement(By.id("email")).sendKeys("kudaleashwini70@yahoo.com");
		//d.findElement(By.id("pass")).sendKeys("Ashu@102718");
		d.findElement(By.name("firstname")).sendKeys("Pallavi");
		d.findElement(By.name("lastname")).sendKeys("kale");
		Thread.sleep(2000);
		d.findElement(By.name("reg_email__")).sendKeys("1234567890");
		d.findElement(By.name("reg_passwd__")).sendKeys("password@123");
		Select dd= new Select(d.findElement(By.xpath("//select[@name='birthday_day']")));
		dd.selectByIndex(10);
		Select dd1= new Select(d.findElement(By.xpath("//select[@name='birthday_month']")));
		dd1.selectByIndex(4);
		Select dd2= new Select(d.findElement(By.xpath("//select[@id='year']")));
		dd2.selectByValue("1992");
		d.findElement(By.id("u_0_9")).click();	
		System.out.println("check radio button selected:"+d.findElement(By.id("u_0_9")).isSelected());
		d.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);
		d.close();
		
	}

}

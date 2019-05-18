package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo1 {

	public static void main(String[] args)throws InterruptedException {
		
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.ie.driver","C:\\Users\\Hemant\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver d=new InternetExplorerDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com/");
		
}
}
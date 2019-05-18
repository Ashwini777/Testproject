package POM;

import org.testng.annotations.Test;

public class LoginScript extends common
	{
		@Test
		public void testLogin() throws InterruptedException
		{
			//Load web page
			d.get("https://www.facebook.com/");
			//assertEquals("Facebook – log in or sign up",d.getTitle());
			Login objLogin=new Login(d);
			objLogin.fillLogin("qttesters","qttesters");
			Thread.sleep(4000);
		}
}

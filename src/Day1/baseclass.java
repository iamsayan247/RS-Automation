package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseclass{
	
	public static WebDriver dr;

	public static void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayan\\OneDrive\\Desktop\\chromedriver_Selenium\\chromedriver.exe");
	    dr=new ChromeDriver();
		dr.get("http://54.156.173.226:5000/");
		dr.manage().window().maximize();
		dr.findElement(By.partialLinkText("Login as super admin")).click();
		dr.findElement(By.id("email")).sendKeys("rock@yopmail.com");
		dr.findElement(By.id("password")).sendKeys("Test@123");
		dr.findElement(By.id("btn-sign-in-sa")).click();
	}

}

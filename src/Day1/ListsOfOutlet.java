package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ListsOfOutlet extends AddOutlet
{
	public static void main(String[] args) throws InterruptedException
	{
		login();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[contains(text(),'Restaurant')]")).click();
		 WebElement p =dr.findElement(By.partialLinkText("Subway"));
	     p.click();
	     Thread.sleep(3000);
	    //Lists of outlet
	     JavascriptExecutor js = (JavascriptExecutor) dr;
	     js.executeScript("window.scrollBy(0,250)", "");
	     Thread.sleep(3000);
	     dr.findElement(By.linkText("USA")).click();
	     Thread.sleep(3000);
	     dr.findElement(By.xpath("/html/body/div/div[1]/div/div/div[3]/div[1]/button")).click(); //add table
	     Thread.sleep(3000);
	     dr.findElement(By.xpath("//*[@id='tableNumber']")).sendKeys("10");
	     dr.findElement(By.xpath("//*[@id='seatingCapacity']")).sendKeys("20");
	     Thread.sleep(3000);
	     dr.findElement(By.xpath("//*[@id='btn-add-table']")).click();
	    
	}

}

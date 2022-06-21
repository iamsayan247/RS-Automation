package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class AddOutlet extends restaurant
{
	public static void main(String[] args) throws InterruptedException
	{
		login();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[contains(text(),'Restaurant')]")).click();
		 WebElement p =dr.findElement(By.partialLinkText("Subway"));
	      p.click();
		Thread.sleep(3000);
		WebElement  w=dr.findElement(By.partialLinkText("Add Outlet"));  //add outlet
		w.click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='location']")).sendKeys("USA");
		dr.findElement(By.xpath("//*[@id='phone']")).sendKeys("1234567892");
		dr.findElement(By.xpath("//*[@id='manager-name']")).sendKeys("Test manager");
		dr.findElement(By.xpath("//*[@id='manager-phone-number']")).sendKeys("1234569872");
		dr.findElement(By.xpath("//*[@id='manager-email']")).sendKeys("data@yopmail.com");
		dr.findElement(By.xpath("//*[@id='save-outlet']")).click();
	}
}

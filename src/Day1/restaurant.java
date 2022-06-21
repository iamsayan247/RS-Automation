package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class restaurant extends baseclass
{
	public static void main(String[] args) throws InterruptedException
	{
		login();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[contains(text(),'Restaurant')]")).click();
		dr.findElement(By.xpath("//button[@data-bs-target='#RestaurantaddModal']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='name']"));
		dr.findElement(By.xpath("//*[@id='name']")).sendKeys("Subway");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='phoneNumber']")).sendKeys("1234567890");
		dr.findElement(By.xpath("//*[@id='adminName']")).sendKeys("Test Admin");
		dr.findElement(By.xpath("//*[@id='adminEmail']")).sendKeys("rock@yopmail.com");
		dr.findElement(By.xpath("//*[@id='adminNumber']")).sendKeys("1234569870");
		dr.findElement(By.xpath("//*[@id='restaurantAddress']")).sendKeys("USA");
		WebElement chooseFile = dr.findElement(By.xpath("//*[@id='image']"));
		chooseFile.sendKeys("C:\\image\\demo1.JPG"); //add image
		dr.findElement(By.xpath("//*[@id='add-restaurant-button']")).click();
		Thread.sleep(3000);
	}
}

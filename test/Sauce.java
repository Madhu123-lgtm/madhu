package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {
	public static void main(String[] args) {
		
       ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		//id to entire the username
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				//id to entire the password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				//id to click login button
				driver.findElement(By.id("login-button")).click();
				driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
				driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
				driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
				driver.findElement(By.id("first-name")).sendKeys("madhu");
				driver.findElement(By.id("last-name")).sendKeys("mitha");
				driver.findElement(By.id("postal-code")).sendKeys("5645");
				driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
				driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
				driver.quit();
				
				
				
		
	}

}

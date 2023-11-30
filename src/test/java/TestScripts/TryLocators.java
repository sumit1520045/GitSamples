package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement srcBox = driver.findElement(By.name("q"));
		srcBox.sendKeys("learn selenium");
		System.out.println("Title....."+driver.getTitle());
		srcBox.sendKeys(Keys.ENTER);

		
	}

}

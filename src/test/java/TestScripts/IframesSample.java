package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		WebElement srcBox = driver.findElement(By.xpath("//input[@type='text']"));
		srcBox.sendKeys("learn selenium");
		
		//Main page
		driver.switchTo().defaultContent();
		WebElement header= driver.findElement(By.xpath("//label/span"));
		System.out.println(header.getText());
		
	//comment

		
	}

}

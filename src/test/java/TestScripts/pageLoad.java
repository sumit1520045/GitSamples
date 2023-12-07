package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame("frame1");
		WebElement srcBox = driver.findElement(By.xpath("//input[@type='text']"));
		srcBox.sendKeys("learn selenium");
		
		//synchronization
		//Implict and Explicit wait
		
	//comment

		
	}

}

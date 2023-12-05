package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSSelectors {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		
		WebElement mainMenu = driver.findElement(By.cssSelector("ul.menu.nav.navbar-nav>li:nth-child(3"));
		mainMenu.click();
	//comment

		
	}

}

package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSSelectors {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		ChromeOptions options= new ChromeOptions();
		options.setBrowserVersion("118");
		driver.get("https://www.seleniumeasy.com/");
		Thread.sleep(2000);
		WebElement mainMenu = driver.findElement(By.cssSelector("ul.menu.nav.navbar-nav>li:nth-child(2"));
		mainMenu.click();
	//comment

		
	}

}

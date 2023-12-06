package TestScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) throws InterruptedException, IOException   {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=18");
		Thread.sleep(2000);
		WebElement testImage = driver.findElement(By.cssSelector("img[alt='MacBook Pro']"));
		Actions action = new Actions(driver); 
		action.scrollToElement(testImage);
		TakesScreenshot screen= (TakesScreenshot)driver;
		File src= screen.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".Png";
		FileUtils.copyFile(src, new File(path1));
		//comment

		
	}

}
